package com.luismaia.desafioanotaai.domain.category.exceptions;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException() {
        super("Category not found");
    }
}
