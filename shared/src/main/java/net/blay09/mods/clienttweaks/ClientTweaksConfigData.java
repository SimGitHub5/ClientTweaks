package net.blay09.mods.clienttweaks;

import com.google.common.collect.Lists;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import net.blay09.mods.balm.api.config.BalmConfigData;
import net.blay09.mods.balm.api.config.Comment;
import java.util.List;

@Config(name = ClientTweaks.MOD_ID)
public class ClientTweaksConfigData implements BalmConfigData {

    @ConfigEntry.Gui.CollapsibleObject
    public Tweaks tweaks = new Tweaks();

    @ConfigEntry.Gui.CollapsibleObject
    public Customization customization = new Customization();

    public static class Tweaks {
        @Comment("This option will let you climb ladders automatically by just looking upwards, rather than requiring a key to be held down.")
        public boolean autoClimbLadder = false;

        @Comment("This prevents the last torch in the offhand from being placed.")
        public boolean doNotUseLastTorch = false;

        @Comment("This option will hide your offhand item. It can be toggled via an optional key binding.")
        public boolean hideOffhandItem = false;

        @Comment("This option will hide your own potion particle effects for your client (other players will still see them).")
        public boolean hideOwnParticleEffects = false;

        @Comment("This option will hide your shield unless you are holding a weapon.")
        public boolean hideShieldUnlessHoldingWeapon = true;

        @Comment("This prevents torches from being placed from your offhand at all.")
        public boolean noOffhandTorchAtAll = false;

        @Comment("This prevents torches from being placed from your offhand if you have a block in your main hand.")
        public boolean noOffhandTorchWithBlock = true;

        @Comment("This prevents torches from being placed from your off hand if you have an empty main hand.")
        public boolean noOffhandTorchWithEmptyHand = false;

        @Comment("This restricts torches to be placed from the offhand only when you're holding a tool in your main hand.")
        public boolean offhandTorchWithToolOnly = false;

        @Comment("This option will disable step assist added by other mods.")
        public boolean disableStepAssist = false;

        @Comment("This adds back the master volume slider to the options screen. Saves you a click!")
        public boolean masterVolumeSlider = true;

        @Comment("This adds back the music volume slider to the options screen. Saves you a click!")
        public boolean musicVolumeSlider = true;

    }

    public static class Customization {
        @Comment("Items that count as torches for the offhand-torch tweak options.")
        public List<String> torchItems = Lists.newArrayList(
                "minecraft:torch",
                "minecraft:soul_torch",
                "tconstruct:stone_torch"
        );

        @Comment("Items that are allowed to place torches from the offhand if offhandTorchWithToolOnly is enabled.")
        public List<String> torchTools = Lists.newArrayList(
                "minecraft:wooden_pickaxe",
                "minecraft:stone_pickaxe",
                "minecraft:iron_pickaxe",
                "minecraft:golden_pickaxe",
                "minecraft:diamond_pickaxe",
                "minecraft:netherite_pickaxe",
                "tconstruct:pickaxe",
                "tconstruct:hammer"
        );

        @Comment("Items that will not prevent offhand-torch placement while in offhand, but do not place torches by themselves")
        public List<String> offhandTorchTools = Lists.newArrayList(
                "tconstruct:shovel",
                "tconstruct:excavator"
        );

        @Comment("Items that count as weapons for the offhand-shield hiding tweak options.")
        public List<String> shieldWeapons = Lists.newArrayList(
                "tetra:modular_sword"
        ) ;
    }

}
