package com.example.multistore;

import java.util.UUID;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.content.commons.repository.ContentStore;
import org.springframework.content.fs.store.FilesystemContentStore;

public interface DocContentStore extends ContentStore<Doc, UUID> {

}
