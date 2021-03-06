package io.committed.krill.extraction.tika;

import org.junit.Test;

import io.committed.krill.extraction.tika.helper.AbstractTikaFormatExtractorIT;

public class SimpleTextTikaFormatExtractorIT extends AbstractTikaFormatExtractorIT {

  private static final String RESOURCE_NAME = "simple.txt";

  public SimpleTextTikaFormatExtractorIT() {
    super(RESOURCE_NAME);
  }

  @Test
  public void testBody() {
    assertBody("" + "<pre>This is a simple text file.\n" + "\n"
        + "It will be output as a set of lines.</pre>");
  }

}
