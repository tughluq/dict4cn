/*  Copyright (c) 2010 Xiaoyun Zhu
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy  
 *  of this software and associated documentation files (the "Software"), to deal  
 *  in the Software without restriction, including without limitation the rights  
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
 *  copies of the Software, and to permit persons to whom the Software is  
 *  furnished to do so, subject to the following conditions:
 *  
 *  The above copyright notice and this permission notice shall be included in  
 *  all copies or substantial portions of the Software.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER  
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN  
 *  THE SOFTWARE.  
 */
package cn.kk.kkdict.types;

import cn.kk.kkdict.utils.Helper;

/**
 * @author x_kez
 * 
 */
public enum TranslationSource {
    EDICT_ZH_ES("edict_hispac"),
    EDICT_ZH_EN("edict_ce"),
    EDICT_JA_EN("edict_je"),
    EDICT_ZH_DE("edict_hande"),
    EDICT_ZH_FR("edict_cf"),
    LEO_DICT("leodict_www"),
    GOOGLE_TRANSLATION("googletrans_www"),
    BABYLON_DICT("babylon_bdict"),
    MYDICT("mydict_www"),
    STARDICT("stardict_ifo"),
    LINGOES_LD2("lingoes_ld2"),
    TERMWIKI("termwiki"),

    WIKI_AA("wiki_aa"),
    WIKI_AB("wiki_ab"),
    WIKI_ACE("wiki_ace"),
    WIKI_AF("wiki_af"),
    WIKI_AK("wiki_ak"),
    WIKI_ALS("wiki_als"),
    WIKI_AM("wiki_am"),
    WIKI_AN("wiki_an"),
    WIKI_ANG("wiki_ang"),
    WIKI_AR("wiki_ar"),
    WIKI_ARC("wiki_arc"),
    WIKI_ARZ("wiki_arz"),
    WIKI_AS("wiki_as"),
    WIKI_AST("wiki_ast"),
    WIKI_AV("wiki_av"),
    WIKI_AY("wiki_ay"),
    WIKI_AZ("wiki_az"),
    WIKI_BA("wiki_ba"),
    WIKI_BAR("wiki_bar"),
    WIKI_BAT_SMG("wiki_bat_smg"),
    WIKI_BCL("wiki_bcl"),
    WIKI_BE("wiki_be"),
    WIKI_BE_X_OLD("wiki_be_x_old"),
    WIKI_BG("wiki_bg"),
    WIKI_BH("wiki_bh"),
    WIKI_BI("wiki_bi"),
    WIKI_BJN("wiki_bjn"),
    WIKI_BM("wiki_bm"),
    WIKI_BN("wiki_bn"),
    WIKI_BO("wiki_bo"),
    WIKI_BPY("wiki_bpy"),
    WIKI_BR("wiki_br"),
    WIKI_BS("wiki_bs"),
    WIKI_BUG("wiki_bug"),
    WIKI_BXR("wiki_bxr"),
    WIKI_CA("wiki_ca"),
    WIKI_CBK_ZAM("wiki_cbk_zam"),
    WIKI_CDO("wiki_cdo"),
    WIKI_CE("wiki_ce"),
    WIKI_CEB("wiki_ceb"),
    WIKI_CH("wiki_ch"),
    WIKI_CHO("wiki_cho"),
    WIKI_CHR("wiki_chr"),
    WIKI_CHY("wiki_chy"),
    WIKI_CKB("wiki_ckb"),
    WIKI_CO("wiki_co"),
    WIKI_CR("wiki_cr"),
    WIKI_CRH("wiki_crh"),
    WIKI_CS("wiki_cs"),
    WIKI_CSB("wiki_csb"),
    WIKI_CU("wiki_cu"),
    WIKI_CV("wiki_cv"),
    WIKI_CY("wiki_cy"),
    WIKI_DA("wiki_da"),
    WIKI_DE("wiki_de"),
    WIKI_DIQ("wiki_diq"),
    WIKI_DSB("wiki_dsb"),
    WIKI_DV("wiki_dv"),
    WIKI_DZ("wiki_dz"),
    WIKI_EE("wiki_ee"),
    WIKI_EL("wiki_el"),
    WIKI_EML("wiki_eml"),
    WIKI_EN("wiki_en"),
    WIKI_EO("wiki_eo"),
    WIKI_ES("wiki_es"),
    WIKI_ET("wiki_et"),
    WIKI_EU("wiki_eu"),
    WIKI_EXT("wiki_ext"),
    WIKI_FA("wiki_fa"),
    WIKI_FF("wiki_ff"),
    WIKI_FI("wiki_fi"),
    WIKI_FIU_VRO("wiki_fiu_vro"),
    WIKI_FJ("wiki_fj"),
    WIKI_FO("wiki_fo"),
    WIKI_FR("wiki_fr"),
    WIKI_FRP("wiki_frp"),
    WIKI_FRR("wiki_frr"),
    WIKI_FUR("wiki_fur"),
    WIKI_FY("wiki_fy"),
    WIKI_GA("wiki_ga"),
    WIKI_GAG("wiki_gag"),
    WIKI_GAN("wiki_gan"),
    WIKI_GD("wiki_gd"),
    WIKI_GL("wiki_gl"),
    WIKI_GLK("wiki_glk"),
    WIKI_GN("wiki_gn"),
    WIKI_GOT("wiki_got"),
    WIKI_GU("wiki_gu"),
    WIKI_GV("wiki_gv"),
    WIKI_HA("wiki_ha"),
    WIKI_HAK("wiki_hak"),
    WIKI_HAW("wiki_haw"),
    WIKI_HE("wiki_he"),
    WIKI_HI("wiki_hi"),
    WIKI_HIF("wiki_hif"),
    WIKI_HO("wiki_ho"),
    WIKI_HR("wiki_hr"),
    WIKI_HSB("wiki_hsb"),
    WIKI_HT("wiki_ht"),
    WIKI_HU("wiki_hu"),
    WIKI_HY("wiki_hy"),
    WIKI_HZ("wiki_hz"),
    WIKI_IA("wiki_ia"),
    WIKI_ID("wiki_id"),
    WIKI_IE("wiki_ie"),
    WIKI_IG("wiki_ig"),
    WIKI_II("wiki_ii"),
    WIKI_IK("wiki_ik"),
    WIKI_ILO("wiki_ilo"),
    WIKI_IO("wiki_io"),
    WIKI_IS("wiki_is"),
    WIKI_IT("wiki_it"),
    WIKI_IU("wiki_iu"),
    WIKI_JA("wiki_ja"),
    WIKI_JBO("wiki_jbo"),
    WIKI_JV("wiki_jv"),
    WIKI_KA("wiki_ka"),
    WIKI_KAA("wiki_kaa"),
    WIKI_KAB("wiki_kab"),
    WIKI_KBD("wiki_kbd"),
    WIKI_KG("wiki_kg"),
    WIKI_KI("wiki_ki"),
    WIKI_KJ("wiki_kj"),
    WIKI_KK("wiki_kk"),
    WIKI_KL("wiki_kl"),
    WIKI_KM("wiki_km"),
    WIKI_KN("wiki_kn"),
    WIKI_KO("wiki_ko"),
    WIKI_KOI("wiki_koi"),
    WIKI_KR("wiki_kr"),
    WIKI_KRC("wiki_krc"),
    WIKI_KS("wiki_ks"),
    WIKI_KSH("wiki_ksh"),
    WIKI_KU("wiki_ku"),
    WIKI_KV("wiki_kv"),
    WIKI_KW("wiki_kw"),
    WIKI_KY("wiki_ky"),
    WIKI_LA("wiki_la"),
    WIKI_LAD("wiki_lad"),
    WIKI_LB("wiki_lb"),
    WIKI_LBE("wiki_lbe"),
    WIKI_LG("wiki_lg"),
    WIKI_LI("wiki_li"),
    WIKI_LIJ("wiki_lij"),
    WIKI_LMO("wiki_lmo"),
    WIKI_LN("wiki_ln"),
    WIKI_LO("wiki_lo"),
    WIKI_LT("wiki_lt"),
    WIKI_LTG("wiki_ltg"),
    WIKI_LV("wiki_lv"),
    WIKI_MAP_BMS("wiki_map_bms"),
    WIKI_MDF("wiki_mdf"),
    WIKI_MG("wiki_mg"),
    WIKI_MH("wiki_mh"),
    WIKI_MHR("wiki_mhr"),
    WIKI_MI("wiki_mi"),
    WIKI_MK("wiki_mk"),
    WIKI_ML("wiki_ml"),
    WIKI_MN("wiki_mn"),
    WIKI_MO("wiki_mo"),
    WIKI_MR("wiki_mr"),
    WIKI_MRJ("wiki_mrj"),
    WIKI_MS("wiki_ms"),
    WIKI_MT("wiki_mt"),
    WIKI_MUS("wiki_mus"),
    WIKI_MWL("wiki_mwl"),
    WIKI_MY("wiki_my"),
    WIKI_MYV("wiki_myv"),
    WIKI_MZN("wiki_mzn"),
    WIKI_NA("wiki_na"),
    WIKI_NAH("wiki_nah"),
    WIKI_NAP("wiki_nap"),
    WIKI_NDS("wiki_nds"),
    WIKI_NDS_NL("wiki_nds_nl"),
    WIKI_NE("wiki_ne"),
    WIKI_NEW("wiki_new"),
    WIKI_NG("wiki_ng"),
    WIKI_NL("wiki_nl"),
    WIKI_NN("wiki_nn"),
    WIKI_NO("wiki_no"),
    WIKI_NOV("wiki_nov"),
    WIKI_NRM("wiki_nrm"),
    WIKI_NSO("wiki_nso"),
    WIKI_NV("wiki_nv"),
    WIKI_NY("wiki_ny"),
    WIKI_OC("wiki_oc"),
    WIKI_OM("wiki_om"),
    WIKI_OR("wiki_or"),
    WIKI_OS("wiki_os"),
    WIKI_PA("wiki_pa"),
    WIKI_PAG("wiki_pag"),
    WIKI_PAM("wiki_pam"),
    WIKI_PAP("wiki_pap"),
    WIKI_PCD("wiki_pcd"),
    WIKI_PDC("wiki_pdc"),
    WIKI_PFL("wiki_pfl"),
    WIKI_PI("wiki_pi"),
    WIKI_PIH("wiki_pih"),
    WIKI_PL("wiki_pl"),
    WIKI_PMS("wiki_pms"),
    WIKI_PNB("wiki_pnb"),
    WIKI_PNT("wiki_pnt"),
    WIKI_PS("wiki_ps"),
    WIKI_PT("wiki_pt"),
    WIKI_QU("wiki_qu"),
    WIKI_RM("wiki_rm"),
    WIKI_RMY("wiki_rmy"),
    WIKI_RN("wiki_rn"),
    WIKI_RO("wiki_ro"),
    WIKI_ROA_RUP("wiki_roa_rup"),
    WIKI_ROA_TARA("wiki_roa_tara"),
    WIKI_RU("wiki_ru"),
    WIKI_RUE("wiki_rue"),
    WIKI_RW("wiki_rw"),
    WIKI_SA("wiki_sa"),
    WIKI_SAH("wiki_sah"),
    WIKI_SC("wiki_sc"),
    WIKI_SCN("wiki_scn"),
    WIKI_SCO("wiki_sco"),
    WIKI_SD("wiki_sd"),
    WIKI_SE("wiki_se"),
    WIKI_SG("wiki_sg"),
    WIKI_SH("wiki_sh"),
    WIKI_SI("wiki_si"),
    WIKI_SIMPLE("wiki_simple"),
    WIKI_SK("wiki_sk"),
    WIKI_SL("wiki_sl"),
    WIKI_SM("wiki_sm"),
    WIKI_SN("wiki_sn"),
    WIKI_SO("wiki_so"),
    WIKI_SQ("wiki_sq"),
    WIKI_SR("wiki_sr"),
    WIKI_SRN("wiki_srn"),
    WIKI_SS("wiki_ss"),
    WIKI_ST("wiki_st"),
    WIKI_STQ("wiki_stq"),
    WIKI_SU("wiki_su"),
    WIKI_SV("wiki_sv"),
    WIKI_SW("wiki_sw"),
    WIKI_SZL("wiki_szl"),
    WIKI_TA("wiki_ta"),
    WIKI_TE("wiki_te"),
    WIKI_TET("wiki_tet"),
    WIKI_TG("wiki_tg"),
    WIKI_TH("wiki_th"),
    WIKI_TI("wiki_ti"),
    WIKI_TK("wiki_tk"),
    WIKI_TL("wiki_tl"),
    WIKI_TN("wiki_tn"),
    WIKI_TO("wiki_to"),
    WIKI_TPI("wiki_tpi"),
    WIKI_TR("wiki_tr"),
    WIKI_TS("wiki_ts"),
    WIKI_TT("wiki_tt"),
    WIKI_TUM("wiki_tum"),
    WIKI_TW("wiki_tw"),
    WIKI_TY("wiki_ty"),
    WIKI_UDM("wiki_udm"),
    WIKI_UG("wiki_ug"),
    WIKI_UK("wiki_uk"),
    WIKI_UR("wiki_ur"),
    WIKI_UZ("wiki_uz"),
    WIKI_VE("wiki_ve"),
    WIKI_VEC("wiki_vec"),
    WIKI_VEP("wiki_vep"),
    WIKI_VI("wiki_vi"),
    WIKI_VLS("wiki_vls"),
    WIKI_VO("wiki_vo"),
    WIKI_WA("wiki_wa"),
    WIKI_WAR("wiki_war"),
    WIKI_WO("wiki_wo"),
    WIKI_WUU("wiki_wuu"),
    WIKI_XAL("wiki_xal"),
    WIKI_XH("wiki_xh"),
    WIKI_XMF("wiki_xmf"),
    WIKI_YI("wiki_yi"),
    WIKI_YO("wiki_yo"),
    WIKI_ZA("wiki_za"),
    WIKI_ZEA("wiki_zea"),
    WIKI_ZH("wiki_zh"),
    WIKI_ZH_CLASSICAL("wiki_zh_classical"),
    WIKI_ZH_MIN_NAN("wiki_zh_min_nan"),
    WIKI_ZH_YUE("wiki_zh_yue"),
    WIKI_ZU("wiki_zu"),
    WIKT_AA("wikt_aa"),
    WIKT_AB("wikt_ab"),
    WIKT_AF("wikt_af"),
    WIKT_AK("wikt_ak"),
    WIKT_ALS("wikt_als"),
    WIKT_AM("wikt_am"),
    WIKT_AN("wikt_an"),
    WIKT_ANG("wikt_ang"),
    WIKT_AR("wikt_ar"),
    WIKT_AS("wikt_as"),
    WIKT_AST("wikt_ast"),
    WIKT_AV("wikt_av"),
    WIKT_AY("wikt_ay"),
    WIKT_AZ("wikt_az"),
    WIKT_BE("wikt_be"),
    WIKT_BG("wikt_bg"),
    WIKT_BH("wikt_bh"),
    WIKT_BI("wikt_bi"),
    WIKT_BM("wikt_bm"),
    WIKT_BN("wikt_bn"),
    WIKT_BO("wikt_bo"),
    WIKT_BR("wikt_br"),
    WIKT_BS("wikt_bs"),
    WIKT_CA("wikt_ca"),
    WIKT_CH("wikt_ch"),
    WIKT_CHR("wikt_chr"),
    WIKT_CO("wikt_co"),
    WIKT_CR("wikt_cr"),
    WIKT_CS("wikt_cs"),
    WIKT_CSB("wikt_csb"),
    WIKT_CY("wikt_cy"),
    WIKT_DA("wikt_da"),
    WIKT_DE("wikt_de"),
    WIKT_DV("wikt_dv"),
    WIKT_DZ("wikt_dz"),
    WIKT_EL("wikt_el"),
    WIKT_EN("wikt_en"),
    WIKT_EO("wikt_eo"),
    WIKT_ES("wikt_es"),
    WIKT_ET("wikt_et"),
    WIKT_EU("wikt_eu"),
    WIKT_FA("wikt_fa"),
    WIKT_FI("wikt_fi"),
    WIKT_FJ("wikt_fj"),
    WIKT_FO("wikt_fo"),
    WIKT_FR("wikt_fr"),
    WIKT_FY("wikt_fy"),
    WIKT_GA("wikt_ga"),
    WIKT_GD("wikt_gd"),
    WIKT_GL("wikt_gl"),
    WIKT_GN("wikt_gn"),
    WIKT_GU("wikt_gu"),
    WIKT_GV("wikt_gv"),
    WIKT_HA("wikt_ha"),
    WIKT_HE("wikt_he"),
    WIKT_HI("wikt_hi"),
    WIKT_HR("wikt_hr"),
    WIKT_HSB("wikt_hsb"),
    WIKT_HU("wikt_hu"),
    WIKT_HY("wikt_hy"),
    WIKT_IA("wikt_ia"),
    WIKT_ID("wikt_id"),
    WIKT_IE("wikt_ie"),
    WIKT_IK("wikt_ik"),
    WIKT_IO("wikt_io"),
    WIKT_IS("wikt_is"),
    WIKT_IT("wikt_it"),
    WIKT_IU("wikt_iu"),
    WIKT_JA("wikt_ja"),
    WIKT_JBO("wikt_jbo"),
    WIKT_JV("wikt_jv"),
    WIKT_KA("wikt_ka"),
    WIKT_KK("wikt_kk"),
    WIKT_KL("wikt_kl"),
    WIKT_KM("wikt_km"),
    WIKT_KN("wikt_kn"),
    WIKT_KO("wikt_ko"),
    WIKT_KS("wikt_ks"),
    WIKT_KU("wikt_ku"),
    WIKT_KW("wikt_kw"),
    WIKT_KY("wikt_ky"),
    WIKT_LA("wikt_la"),
    WIKT_LB("wikt_lb"),
    WIKT_LI("wikt_li"),
    WIKT_LN("wikt_ln"),
    WIKT_LO("wikt_lo"),
    WIKT_LT("wikt_lt"),
    WIKT_LV("wikt_lv"),
    WIKT_MG("wikt_mg"),
    WIKT_MH("wikt_mh"),
    WIKT_MI("wikt_mi"),
    WIKT_MK("wikt_mk"),
    WIKT_ML("wikt_ml"),
    WIKT_MN("wikt_mn"),
    WIKT_MO("wikt_mo"),
    WIKT_MR("wikt_mr"),
    WIKT_MS("wikt_ms"),
    WIKT_MT("wikt_mt"),
    WIKT_MY("wikt_my"),
    WIKT_NA("wikt_na"),
    WIKT_NAH("wikt_nah"),
    WIKT_NDS("wikt_nds"),
    WIKT_NE("wikt_ne"),
    WIKT_NL("wikt_nl"),
    WIKT_NN("wikt_nn"),
    WIKT_NO("wikt_no"),
    WIKT_OC("wikt_oc"),
    WIKT_OM("wikt_om"),
    WIKT_OR("wikt_or"),
    WIKT_PA("wikt_pa"),
    WIKT_PI("wikt_pi"),
    WIKT_PL("wikt_pl"),
    WIKT_PNB("wikt_pnb"),
    WIKT_PS("wikt_ps"),
    WIKT_PT("wikt_pt"),
    WIKT_QU("wikt_qu"),
    WIKT_RM("wikt_rm"),
    WIKT_RN("wikt_rn"),
    WIKT_RO("wikt_ro"),
    WIKT_ROA_RUP("wikt_roa_rup"),
    WIKT_RU("wikt_ru"),
    WIKT_RW("wikt_rw"),
    WIKT_SA("wikt_sa"),
    WIKT_SC("wikt_sc"),
    WIKT_SCN("wikt_scn"),
    WIKT_SD("wikt_sd"),
    WIKT_SG("wikt_sg"),
    WIKT_SH("wikt_sh"),
    WIKT_SI("wikt_si"),
    WIKT_SIMPLE("wikt_simple"),
    WIKT_SK("wikt_sk"),
    WIKT_SL("wikt_sl"),
    WIKT_SM("wikt_sm"),
    WIKT_SN("wikt_sn"),
    WIKT_SO("wikt_so"),
    WIKT_SQ("wikt_sq"),
    WIKT_SR("wikt_sr"),
    WIKT_SS("wikt_ss"),
    WIKT_ST("wikt_st"),
    WIKT_SU("wikt_su"),
    WIKT_SV("wikt_sv"),
    WIKT_SW("wikt_sw"),
    WIKT_TA("wikt_ta"),
    WIKT_TE("wikt_te"),
    WIKT_TG("wikt_tg"),
    WIKT_TH("wikt_th"),
    WIKT_TI("wikt_ti"),
    WIKT_TK("wikt_tk"),
    WIKT_TL("wikt_tl"),
    WIKT_TN("wikt_tn"),
    WIKT_TO("wikt_to"),
    WIKT_TPI("wikt_tpi"),
    WIKT_TR("wikt_tr"),
    WIKT_TS("wikt_ts"),
    WIKT_TT("wikt_tt"),
    WIKT_TW("wikt_tw"),
    WIKT_UG("wikt_ug"),
    WIKT_UK("wikt_uk"),
    WIKT_UR("wikt_ur"),
    WIKT_UZ("wikt_uz"),
    WIKT_VI("wikt_vi"),
    WIKT_VO("wikt_vo"),
    WIKT_WA("wikt_wa"),
    WIKT_WO("wikt_wo"),
    WIKT_XH("wikt_xh"),
    WIKT_YI("wikt_yi"),
    WIKT_YO("wikt_yo"),
    WIKT_ZA("wikt_za"),
    WIKT_ZH("wikt_zh"),
    WIKT_ZH_MIN_NAN("wikt_zh_min_nan"),
    WIKT_ZU("wikt_zu"), ;
    public static final String TYPE_ID = "源";
    public static final byte[] TYPE_ID_BYTES = TYPE_ID.getBytes(Helper.CHARSET_UTF8);
    public final String key;
    public final byte[] keyBytes;

    TranslationSource(String key) {
        this.key = key;
        this.keyBytes = key.getBytes(Helper.CHARSET_UTF8);
    }
}
