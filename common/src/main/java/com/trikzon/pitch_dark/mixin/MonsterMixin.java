package com.trikzon.pitch_dark.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LightType;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(HostileEntity.class)
public abstract class MonsterMixin extends PathAwareEntity {
    public MonsterMixin(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "isSpawnDark", at = @At("HEAD"), cancellable = true)
    private static void pitch_dark_isDarkEnoughToSpawn(ServerWorldAccess world, BlockPos pos, Random random, CallbackInfoReturnable<Boolean> cir) {
        if (world.getLightLevel(LightType.BLOCK, pos) > 0) {
            cir.setReturnValue(false);
        }
    }
}
