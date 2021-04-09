package com.cosmoneural;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Task implements Runnable{

    private final int number;

    public Task(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        String url = "YOURURL";

        try {
            URL newURL = new URL(url);
            InputStream in = newURL.openStream();
            ReadableByteChannel rbc = Channels.newChannel(in);
            FileOutputStream fos = new FileOutputStream("/YOURPATH"+number+".pdf");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
        catch (IOException ex)
        {
            System.out.println("file not found "+url);
        }
    }
}
