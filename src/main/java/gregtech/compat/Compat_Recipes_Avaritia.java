package gregtech.compat;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import gregapi.api.Abstract_Mod;
import gregapi.code.ModData;
import gregapi.compat.CompatMods;
import gregapi.data.*;
import gregapi.util.ST;

import static gregapi.data.CS.*;

public class Compat_Recipes_Avaritia extends CompatMods {
    public Compat_Recipes_Avaritia(ModData aMod, Abstract_Mod aGTMod) {super(aMod, aGTMod);}

    @Override public void onPostLoad(FMLPostInitializationEvent aInitEvent) {OUT.println("GT_Mod: Simplifying Avaritia.");
        RM.Replicator.addRecipe2(F, 16, 288000, ST.make(MD.AV,"Resource",0,5), OP.gem.mat(MT.NetherStar, 1), FL.array(FL.MatterNeutral.make(144), FL.MatterCharged.make(144), MT.Vb.liquid(U, T)), NF, ST.make(MD.AV,"Resource",0,5));
    }
}
