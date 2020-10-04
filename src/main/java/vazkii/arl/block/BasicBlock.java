package vazkii.arl.block;

import net.minecraft.block.Block;
import vazkii.arl.util.RegistryHelper;

public class BasicBlock extends Block {

	public BasicBlock(String regname, Settings properties) {
		super(properties);
		
		RegistryHelper.registerBlock(this, regname);
	}

}
