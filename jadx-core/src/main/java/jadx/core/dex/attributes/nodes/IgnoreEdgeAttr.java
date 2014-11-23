package jadx.core.dex.attributes.nodes;

import jadx.core.dex.attributes.AType;
import jadx.core.dex.attributes.IAttribute;
import jadx.core.dex.nodes.BlockNode;
import jadx.core.utils.Utils;

import java.util.HashSet;
import java.util.Set;

public class IgnoreEdgeAttr implements IAttribute {

	private final Set<BlockNode> blocks = new HashSet<BlockNode>();

	public Set<BlockNode> getBlocks() {
		return blocks;
	}

	public boolean contains(BlockNode block) {
		return blocks.contains(block);
	}

	@Override
	public AType<IgnoreEdgeAttr> getType() {
		return AType.IGNORE_EDGE;
	}

	@Override
	public String toString() {
		return "IGNORE_EDGES: " + Utils.listToString(blocks);
	}
}
