package hei.arit.demo.file.hash;

import hei.arit.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
