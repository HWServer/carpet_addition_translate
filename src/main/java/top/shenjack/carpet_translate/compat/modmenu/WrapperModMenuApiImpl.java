package top.shenjack.carpet_translate.compat.modmenu;

import top.shenjack.carpet_translate.TemplateMod;

public class WrapperModMenuApiImpl extends ModMenuApiImpl {

    @Override
    public String getModIdCompat() {
        return TemplateMod.MOD_ID;
    }

}