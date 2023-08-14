package com.group7.bookshopwebsite.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CartItemDTO {
    private Long bookId;
    private String title;
    private Double price;
    private Integer quantity;
}
