package com.example.multistore;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.content.commons.annotations.ContentId;
import org.springframework.content.commons.annotations.ContentLength;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Doc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ContentId
    private UUID contentId;

    @ContentLength
    private Long contentLen;
}
