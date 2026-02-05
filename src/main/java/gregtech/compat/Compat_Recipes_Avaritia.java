package gregtech.compat;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import gregapi.api.Abstract_Mod;
import gregapi.code.ModData;
import gregapi.compat.CompatMods;
import gregapi.data.*;
import gregapi.util.OM;
import gregapi.util.ST;
import net.minecraft.block.Block;

import static gregapi.data.CS.*;

public class Compat_Recipes_Avaritia extends CompatMods {
    public Compat_Recipes_Avaritia(ModData aMod, Abstract_Mod aGTMod) {super(aMod, aGTMod);}

    @Override public void onPostLoad(FMLPostInitializationEvent aInitEvent) {OUT.println("GT_Mod: Simplifying Avaritia.");

        RM.Replicator.addRecipe2(F, 16, 288000 , 400 , ST.make(MD.AV,"Resource",0,5), OP.gem         .mat(MT.NetherStar, 1), FL.array(FL.MatterNeutral.make(144 ), FL.MatterCharged.make(144 ), MT.Vb.liquid(1*U, T)), NF, ST.make(MD.AV,"Resource",1 ,5));
        RM.Replicator.addRecipe2(F, 16, 576000 , 500 , ST.make(MD.AV,"Resource",0,5), OP.gemFlawless .mat(MT.NetherStar, 1), FL.array(FL.MatterNeutral.make(288 ), FL.MatterCharged.make(288 ), MT.Vb.liquid(2*U, T)), NF, ST.make(MD.AV,"Resource",3 ,5));
        RM.Replicator.addRecipe2(F, 16, 1152000, 700 , ST.make(MD.AV,"Resource",0,5), OP.gemExquisite.mat(MT.NetherStar, 1), FL.array(FL.MatterNeutral.make(576 ), FL.MatterCharged.make(576 ), MT.Vb.liquid(4*U, T)), NF, ST.make(MD.AV,"Resource",8 ,5));
        RM.Replicator.addRecipe2(F, 16, 2304000, 1000, ST.make(MD.AV,"Resource",0,5), OP.gemLegendary.mat(MT.NetherStar, 1), FL.array(FL.MatterNeutral.make(1152), FL.MatterCharged.make(1152), MT.Vb.liquid(8*U, T)), NF, ST.make(MD.AV,"Resource",23,5));


        RM.Bath.addRecipe1(T, 0, 1024, OP.dust     .mat(MT.NetherStar, 16), MT.Petrotheum.liquid(9*U5,T), NF, OP.oreVanillastone     .mat(MT.NetherStar, 1));
    }
}
