package com.github.gfx.ormawithjack;

import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

import java.util.List;

@Table
public class Book {

    @PrimaryKey
    long id;

    @Column
    String title;

    @Column
    List<String> authors;

}
