package com.jorgecruces.euler4.xml;

import android.content.Context;

import org.w3c.dom.Document;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLInputHandler {

    private String assetName;
    private final Context context;

    public XMLInputHandler(String assetName, Context context) {
        this.context = context;
        this.assetName = assetName;
    }

    public Document getDocumentFromInputStream() {
        try {
            InputStream in = context.getAssets().open(this.assetName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            return dBuilder.parse(in);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
