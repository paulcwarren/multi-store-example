package com.example.multistore;

import java.util.UUID;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.content.fs.store.FilesystemContentStore;

@ConditionalOnProperty(prefix = "springcontentdemo.storage", name = "type", havingValue = "filesystem")
public interface FsDocContentStore extends FilesystemContentStore<Doc, UUID> {

}
