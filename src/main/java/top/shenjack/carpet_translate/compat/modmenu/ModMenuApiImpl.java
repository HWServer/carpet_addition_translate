package top.shenjack.carpet_translate.compat.modmenu;

import top.shenjack.carpet_translate.TemplateMod;
import top.shenjack.carpet_translate.gui.GuiConfigs;
import top.hendrixshen.magiclib.compat.modmenu.ModMenuCompatApi;

public class ModMenuApiImpl implements ModMenuCompatApi {
    @Override
    public ConfigScreenFactoryCompat<?> getConfigScreenFactoryCompat() {
        return (screen) -> {
            GuiConfigs gui = GuiConfigs.getInstance();
            gui.setParentGui(screen);
            return gui;
        };
    }

    @Override
    public String getModIdCompat() {
        return TemplateMod.CURRENT_MOD_ID;
    }

}