package com.example.multistore;

import org.springframework.content.fs.config.EnableFilesystemStores;
import org.springframework.context.annotation.Configuration;

@EnableFilesystemStores("com.example.multistore")
@Configuration
public class FilesystemStorageConfig {

}
