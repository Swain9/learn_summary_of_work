package com.maolin.chat;

import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.jgroups.View;
import org.jgroups.util.Util;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * https://blog.csdn.net/happywei520/article/details/47419547
 *
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-07-10 15:14
 */
public class SimpleChat extends ReceiverAdapter {
    private JChannel channel;
    private final String USER_NAME = System.getProperty("user.name", "n/a");
    private final List<String> state = new LinkedList<String>();

    private void start() throws Exception {
        // use the default config, udp.xml
        this.channel = new JChannel().setReceiver(this);
        this.channel.connect("ChatCluster");
        this.channel.getState(null, 10000);
        eventLoop();
        this.channel.close();
    }

    @Override
    public void receive(Message msg) {
        String line = msg.getSrc() + ": " + msg.getObject();
        System.out.println(line);
        synchronized (state) {
            state.add(line);
        }
    }

    @Override
    public void viewAccepted(View view) {
        System.out.println("** view: " + view);
    }

    @Override
    public void getState(OutputStream output) throws Exception {
        synchronized (state) {
            Util.objectToStream(state, new DataOutputStream(output));
        }
    }

    @Override
    public void setState(InputStream input) throws Exception {
        List<String> list;
        list=(List<String>)Util.objectFromStream(new DataInputStream(input));
        synchronized(state) {
            state.clear();
            state.addAll(list);
        }
        System.out.println(list.size() + " messages in chat history):");
        //list.forEach(System.out::println);
    }

    private void eventLoop() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print("> ");
                System.out.flush();
                String line = in.readLine().toLowerCase();
                if (line.startsWith("quit") || line.startsWith("exit")) {
                    break;
                }
                line = "[" + USER_NAME + "] " + line;
                Message msg = new Message(null, line);
                channel.send(msg);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new SimpleChat().start();
    }
}
