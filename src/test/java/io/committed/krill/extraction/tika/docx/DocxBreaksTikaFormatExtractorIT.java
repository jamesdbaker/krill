package io.committed.krill.extraction.tika.docx;

import org.junit.Ignore;
import org.junit.Test;

import io.committed.krill.extraction.tika.helper.AbstractTikaFormatExtractorIT;

public class DocxBreaksTikaFormatExtractorIT extends AbstractTikaFormatExtractorIT {

  private static final String RESOURCE_NAME = "breaks.docx";

  public DocxBreaksTikaFormatExtractorIT() {
    super(RESOURCE_NAME);
  }

  @Test
  /*
   * Will fail due to previous reliance on Apache Tika fork. This should pass in the next version of Tika
   */
  @Ignore
  public void testBody() {
    assertBody("" +
        "<main class=\"Document\"> \n" +
        " <h3><a name=\"_Toc465796965\"></a>Breaks, quotes, et al.</h3> \n" +
        " <p>It is possible to quote text. The following text is in the ‘Quote’ style and was created by typing =rand(4,1) into the document:</p> \n"
        +
        " <blockquote>\n" +
        "   The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. \n"
        +
        " </blockquote> \n" +
        " <p>The =lorum() generator that is present on Windows isn’t available in Word for Mac 2016, so the following text has been quoted, using the Intense Quote style, from <a href=\"http://www.lipsum.com\">www.lipsum.com</a> (the previous URL has been captured as a link and is in the ‘Hyperlink’ style). This is, apparently, “The standard Lorem Ipsum passage, used since the 1500s”:</p> \n"
        +
        " <blockquote>\n" +
        "   \"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\" \n"
        +
        " </blockquote> \n" +
        " <p>We are able to divide a document into different sections.</p> \n" +
        " <hr class=\"pagebreak\">  \n" +
        " <p>There was a page break immediately before this sentence.</p> \n" +
        " <p><a name=\"MyBookmark\"></a><a name=\"MyBookmark2\"></a>There is a bookmark immediately before this sentence (Bookmark1) and another immediately after it (BookMark2) but before the full stop.</p> \n"
        +
        " <p>We may decide to split a table over a page break, as below. In this case we have padded the table to the bottom of the page with empty lines, and split the table after row 1 using a Page Break.</p> \n"
        +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <p></p> \n" +
        " <table> \n" +
        "  <tbody> \n" +
        "   <tr> \n" +
        "    <td><p>A</p> </td> \n" +
        "    <td><p>B</p> </td> \n" +
        "    <td><p>C</p> </td> \n" +
        "    <td><p>D</p> </td> \n" +
        "   </tr> \n" +
        "   <tr> \n" +
        "    <td><p>1a</p> </td> \n" +
        "    <td><p>1b</p> </td> \n" +
        "    <td><p>1c</p> </td> \n" +
        "    <td><p>1d</p> </td> \n" +
        "   </tr> \n" +
        "  </tbody> \n" +
        " </table> \n" +
        " <hr class=\"pagebreak\">  \n" +
        " <table> \n" +
        "  <tbody> \n" +
        "   <tr> \n" +
        "    <td><p>2a</p> </td> \n" +
        "    <td><p>2b</p> </td> \n" +
        "    <td><p>2c</p> </td> \n" +
        "    <td><p>2d</p> </td> \n" +
        "   </tr> \n" +
        "   <tr> \n" +
        "    <td><p>3a</p> </td> \n" +
        "    <td><p>3b</p> </td> \n" +
        "    <td><p>3c</p> </td> \n" +
        "    <td><p>3d</p> </td> \n" +
        "   </tr> \n" +
        "  </tbody> \n" +
        " </table> \n" +
        " <p></p> \n" +
        " <header> \n" +
        "  <p></p> \n" +
        "  <p class=\"normal_(Web)\">SAMPLE</p> \n" +
        "  <p></p> \n" +
        " </header> \n" +
        " <header> \n" +
        "  <p></p> \n" +
        "  <p class=\"normal_(Web)\">SAMPLE</p> \n" +
        "  <p></p> \n" +
        " </header> \n" +
        " <header> \n" +
        "  <p>Header</p> \n" +
        "  <p class=\"normal_(Web)\">SAMPLE</p> \n" +
        "  <p></p> \n" +
        "  <p></p> \n" +
        " </header> \n" +
        " <p>Immediately after this sentence, and after the full stop, is a continuous section break.</p> \n"
        +
        " <footer> \n" +
        "  <p></p> \n" +
        " </footer> \n" +
        " <footer> \n" +
        "  <p></p> \n" +
        "  <p></p> \n" +
        " </footer> \n" +
        " <footer> \n" +
        "  <p>Page 1 of 1 </p> \n" +
        "  <p>Footer</p> \n" +
        " </footer> \n" +
        " <p>However, the section break after this sentence, and after the full stop, will start a new page.</p> \n"
        +
        " <p>On this page we number the first three lines.</p> \n" +
        " <p>This is the second line.</p> \n" +
        " <p>This is third line.</p> \n" +
        " <p></p> \n" +
        " <p>We can put text into two columns. This seems like another good test for the =rand(x,y) test.</p> \n"
        +
        " <p></p> \n" +
        " <p>The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.</p> \n"
        +
        " <p>The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.</p> \n"
        +
        " <p>The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.</p> \n"
        +
        " <p> The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.</p> \n"
        +
        " <p>The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.</p> \n"
        +
        " <p>The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.</p> \n"
        +
        " <p></p> \n" +
        " <p>Images can have captions (in this case the image is a SmartArt diagram):</p> \n" +
        " <figcaption>\n" +
        "   Figure 1: All too often Scrum becomes Scrummerfall or Water-Scrum-Fall, ie handing over to different teams \n"
        +
        " </figcaption> \n" +
        "</main>");
  }

}
