package com.tognato.admin.catalogo.application;

import com.tognato.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}