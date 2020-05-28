/*
 * This file is part of Clairvoyant
 * Copyright (C) 2020, Chriss.
 *
 * This code is licensed under GNU General Public License v3.0, the full license text can be found in LICENSE
 */

package io.github.clairvoyant.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;
import net.minecraft.util.DyeColor;

public class TimewornBrickWall extends WallBlock {
    public TimewornBrickWall() {
        super(FabricBlockSettings.copy(Blocks.BRICKS).materialColor(DyeColor.GRAY).build());
    }
}