package com.example.SwiftCart.model;

import java.sql.Blob;

public class Image {
    private Long id;
    private String fileName;
    private String fileType;
    private Blob blob;
    private String downloadUrl;

    private Product product;
}
