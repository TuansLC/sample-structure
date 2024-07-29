package com.c06.model.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenericResponsePage<T> {

    private List<T> data;
    private Long totalElement;
    private int pageIndex;
    private int totalPage;
}

