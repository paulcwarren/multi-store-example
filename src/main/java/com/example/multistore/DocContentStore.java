package com.example.multistore;

import java.util.UUID;

import org.springframework.content.commons.repository.ContentStore;

public interface DocContentStore extends ContentStore<Doc, UUID> {

}
