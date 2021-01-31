package com.example.multistore;

import java.util.UUID;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.content.s3.store.S3ContentStore;

@ConditionalOnProperty(prefix = "springcontentdemo.storage.", name = "type", havingValue = "s3", matchIfMissing = true)
public interface S3DocContentStore extends S3ContentStore<Doc, UUID> {

}
