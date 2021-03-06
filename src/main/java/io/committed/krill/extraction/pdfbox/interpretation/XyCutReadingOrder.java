package io.committed.krill.extraction.pdfbox.interpretation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.TreeTraverser;

import io.committed.krill.extraction.pdfbox.physical.PositionedContainer;
import io.committed.krill.extraction.pdfbox.text.RecursiveXyCut;
import io.committed.krill.extraction.pdfbox.text.RecursiveXyCut.TreeNode;
import io.committed.krill.extraction.tika.pdf.PdfParserConfig;

/**
 * A {@link ReadingOrder} that uses the recursive x-y cut algorithm to determine a reading order.
 * <p>
 * A tree is built up from the blocks on the page - the whole page is the root, and then the
 * contents are split (if possible) by a vertical cut from top to bottom, and if not by a horizontal
 * cut. This is repeated recursively until no more splits are achieved (or a
 * {@link StackOverflowError} occurs!).
 * </p>
 */
public class XyCutReadingOrder implements ReadingOrder {

  public XyCutReadingOrder(PdfParserConfig parserConfig) {
    // TODO Auto-generated constructor stub
  }

  @Override
  public List<LabellablePositioned> order(Collection<LabellablePositioned> blocks) {

    TreeNode<PositionedContainer<LabellablePositioned>> root =
        new TreeNode<>(new PositionedContainer<LabellablePositioned>(new ArrayList<>(blocks)));

    new RecursiveXyCut<LabellablePositioned>(0, 0, 10).apply(root);
    List<LabellablePositioned> orderedBlocks = new ArrayList<>();

    TreeTraverser<TreeNode<PositionedContainer<LabellablePositioned>>> traverser =
        TreeTraverser.using(TreeNode::getChildren);
    traverser.preOrderTraversal(root).forEach(s -> orderedBlocks.addAll(s.getData().getContents()));

    return orderedBlocks;
  }

}
