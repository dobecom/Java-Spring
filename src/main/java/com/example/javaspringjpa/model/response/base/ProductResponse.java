package com.example.javaspringjpa.model.response.base;


import com.example.javaspringjpa.model.response.Status;

public abstract class ProductResponse {

    private static final Status status = Status.SUCCESS;

    protected Status getStatus() {
        return status;
    }
}
