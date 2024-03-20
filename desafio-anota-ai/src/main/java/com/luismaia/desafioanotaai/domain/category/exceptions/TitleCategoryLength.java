package com.luismaia.desafioanotaai.domain.category.exceptions;

public class TitleCategoryLength extends RuntimeException {
    public TitleCategoryLength() {
        super("title should be length >=4");
    }
}
