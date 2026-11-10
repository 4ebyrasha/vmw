/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.vicmatskiv.mw;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AACHoneyBadgerHandguard;
import com.vicmatskiv.mw.models.AACHoneyBadgerReceiver;
import com.vicmatskiv.mw.models.AACHoneyBadgerSilencer;
import com.vicmatskiv.mw.models.AACHoneyBadgerStock;
import com.vicmatskiv.mw.models.AACKnightsArmamentReceiver;
import com.vicmatskiv.mw.models.AACMatrixArmsHandguard;
import com.vicmatskiv.mw.models.ACOG;
import com.vicmatskiv.mw.models.ACRFixedStock;
import com.vicmatskiv.mw.models.ACRHandGuard;
import com.vicmatskiv.mw.models.ACRLongRangeStock;
import com.vicmatskiv.mw.models.ACRPDWStock;
import com.vicmatskiv.mw.models.ACRPRSStock;
import com.vicmatskiv.mw.models.ACRPolymerHandguard;
import com.vicmatskiv.mw.models.ACRPrecisionHandguard;
import com.vicmatskiv.mw.models.ACRSBRHandguard;
import com.vicmatskiv.mw.models.ACRSquareDropHandguard;
import com.vicmatskiv.mw.models.ACRStock;
import com.vicmatskiv.mw.models.ACRWEMSKHandguard;
import com.vicmatskiv.mw.models.AK101DustCover;
import com.vicmatskiv.mw.models.AK101HandGuard;
import com.vicmatskiv.mw.models.AK101Stock;
import com.vicmatskiv.mw.models.AK15DustCover;
import com.vicmatskiv.mw.models.AK15HandleGuard;
import com.vicmatskiv.mw.models.AK15ironsight;
import com.vicmatskiv.mw.models.AK47DustCover;
import com.vicmatskiv.mw.models.AK47HandleGuard;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AK47stock;
import com.vicmatskiv.mw.models.AKErgoGrip;
import com.vicmatskiv.mw.models.AKGrip;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.AKiron3;
import com.vicmatskiv.mw.models.AR10SuperSASSHandguard;
import com.vicmatskiv.mw.models.AR57Handguard;
import com.vicmatskiv.mw.models.AR57Receiver;
import com.vicmatskiv.mw.models.ARPRSPrecisionStock;
import com.vicmatskiv.mw.models.ARX160;
import com.vicmatskiv.mw.models.AUG9mmCONVERSIONkit;
import com.vicmatskiv.mw.models.AUGA1;
import com.vicmatskiv.mw.models.AUGA2;
import com.vicmatskiv.mw.models.AUGA3M1;
import com.vicmatskiv.mw.models.AUGA3M1_Ext;
import com.vicmatskiv.mw.models.AUGGrip;
import com.vicmatskiv.mw.models.AUGScope;
import com.vicmatskiv.mw.models.AUGScope_scope;
import com.vicmatskiv.mw.models.AX50Scope;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.AimpointCompM5;
import com.vicmatskiv.mw.models.AngledGrip;
import com.vicmatskiv.mw.models.BR55scope;
import com.vicmatskiv.mw.models.BR55scopereticle;
import com.vicmatskiv.mw.models.BijiaReflex;
import com.vicmatskiv.mw.models.Bipod;
import com.vicmatskiv.mw.models.Block2SOCOMHandguard;
import com.vicmatskiv.mw.models.C8SFWHandguard;
import com.vicmatskiv.mw.models.CollapsableMOEStock;
import com.vicmatskiv.mw.models.DMRscope;
import com.vicmatskiv.mw.models.DMRscopeReticle;
import com.vicmatskiv.mw.models.DanWessonLaser;
import com.vicmatskiv.mw.models.DesertEagle;
import com.vicmatskiv.mw.models.DesertEagleLong;
import com.vicmatskiv.mw.models.DesertEagleSlide;
import com.vicmatskiv.mw.models.EF88;
import com.vicmatskiv.mw.models.EotechHybrid2;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.F2000Reticle;
import com.vicmatskiv.mw.models.F2000Scope;
import com.vicmatskiv.mw.models.F2000Scope2;
import com.vicmatskiv.mw.models.FABDefenseMount;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.FNFALDustCover;
import com.vicmatskiv.mw.models.FNFALGrip;
import com.vicmatskiv.mw.models.FNFALHandguard;
import com.vicmatskiv.mw.models.FNFALPARAHandguard;
import com.vicmatskiv.mw.models.FNFALRearSight;
import com.vicmatskiv.mw.models.FNFALStock;
import com.vicmatskiv.mw.models.G2ContenderBarrelLong;
import com.vicmatskiv.mw.models.G2ContenderBarrelShort;
import com.vicmatskiv.mw.models.G2ContenderGrip;
import com.vicmatskiv.mw.models.G2ContenderStock;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.G36KReticle;
import com.vicmatskiv.mw.models.G36KScope;
import com.vicmatskiv.mw.models.G95_upright_frontsights;
import com.vicmatskiv.mw.models.G95_upright_rearsights;
import com.vicmatskiv.mw.models.Glock18CCNCslide;
import com.vicmatskiv.mw.models.Glock18Cslide;
import com.vicmatskiv.mw.models.Glock18Cstock;
import com.vicmatskiv.mw.models.Glock19;
import com.vicmatskiv.mw.models.Glock19GhostPrecisionSlide;
import com.vicmatskiv.mw.models.Glock19Rockslide;
import com.vicmatskiv.mw.models.Glock19Slide;
import com.vicmatskiv.mw.models.GlockHogueGrip;
import com.vicmatskiv.mw.models.GlockRazorback;
import com.vicmatskiv.mw.models.GlockRazorbackSlide;
import com.vicmatskiv.mw.models.GlockRearSight;
import com.vicmatskiv.mw.models.Grip2;
import com.vicmatskiv.mw.models.HK416Stock;
import com.vicmatskiv.mw.models.HKS20Grip;
import com.vicmatskiv.mw.models.HKS20Handguard;
import com.vicmatskiv.mw.models.HKS20Stock;
import com.vicmatskiv.mw.models.HP;
import com.vicmatskiv.mw.models.HeraArmsGrip;
import com.vicmatskiv.mw.models.HeraArmsStock;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.JunoGrip;
import com.vicmatskiv.mw.models.K2C1Grip;
import com.vicmatskiv.mw.models.K2C1Handguard;
import com.vicmatskiv.mw.models.K2C1RearSight;
import com.vicmatskiv.mw.models.KA_AK12_Ironsight;
import com.vicmatskiv.mw.models.Kar98Krail;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.KobraGen3;
import com.vicmatskiv.mw.models.KrissVectorHandguard;
import com.vicmatskiv.mw.models.KrissVectorModified;
import com.vicmatskiv.mw.models.KrissVectorRailRiser;
import com.vicmatskiv.mw.models.KrissVectorStock;
import com.vicmatskiv.mw.models.KrissVectorSwordfish;
import com.vicmatskiv.mw.models.LVOAVHandGuard;
import com.vicmatskiv.mw.models.Laser;
import com.vicmatskiv.mw.models.Laser3;
import com.vicmatskiv.mw.models.Leupold;
import com.vicmatskiv.mw.models.LeupoldRail;
import com.vicmatskiv.mw.models.M1014stock;
import com.vicmatskiv.mw.models.M14Body;
import com.vicmatskiv.mw.models.M14Cover;
import com.vicmatskiv.mw.models.M14DMRRail;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M14TriRailCover;
import com.vicmatskiv.mw.models.M16A1Handguard;
import com.vicmatskiv.mw.models.M16A1PicatinnyRail;
import com.vicmatskiv.mw.models.M16A1RearSight;
import com.vicmatskiv.mw.models.M16A1ScopeMount;
import com.vicmatskiv.mw.models.M16A4Handguard;
import com.vicmatskiv.mw.models.M16HandGuard;
import com.vicmatskiv.mw.models.M16Stock;
import com.vicmatskiv.mw.models.M191144MagBody;
import com.vicmatskiv.mw.models.M191144MagSlide;
import com.vicmatskiv.mw.models.M1911Body;
import com.vicmatskiv.mw.models.M1911Slide;
import com.vicmatskiv.mw.models.M1911frontsight;
import com.vicmatskiv.mw.models.M1928Grip;
import com.vicmatskiv.mw.models.M1A1CarbineStock;
import com.vicmatskiv.mw.models.M1A1Grip;
import com.vicmatskiv.mw.models.M1CarbineBody;
import com.vicmatskiv.mw.models.M1CarbineHandguard;
import com.vicmatskiv.mw.models.M1CarbineVentilatedHandguard;
import com.vicmatskiv.mw.models.M1ScoutCarbineHandguard;
import com.vicmatskiv.mw.models.M249HandGuard;
import com.vicmatskiv.mw.models.M249Stock;
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M2A1;
import com.vicmatskiv.mw.models.M2A1reticle;
import com.vicmatskiv.mw.models.M38HandGuard;
import com.vicmatskiv.mw.models.M4AsiimovStock;
import com.vicmatskiv.mw.models.M4BenelliStock;
import com.vicmatskiv.mw.models.M4CarbineHandGuard;
import com.vicmatskiv.mw.models.M4Grip;
import com.vicmatskiv.mw.models.M4HandGuard;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.M4MagpulHandGuard;
import com.vicmatskiv.mw.models.M4Receiver;
import com.vicmatskiv.mw.models.M60E4Guard;
import com.vicmatskiv.mw.models.M60FrontSight;
import com.vicmatskiv.mw.models.M60HandGuard;
import com.vicmatskiv.mw.models.M9;
import com.vicmatskiv.mw.models.M9A1frontsight;
import com.vicmatskiv.mw.models.M9A1rearsight;
import com.vicmatskiv.mw.models.M9slide;
import com.vicmatskiv.mw.models.MA5Dcover;
import com.vicmatskiv.mw.models.MAC10Action;
import com.vicmatskiv.mw.models.MAC10Body;
import com.vicmatskiv.mw.models.MAC10Grip;
import com.vicmatskiv.mw.models.MAC10Stock;
import com.vicmatskiv.mw.models.MBUSFrontSight;
import com.vicmatskiv.mw.models.MBUSRearSight;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MIMP5MHandGuard;
import com.vicmatskiv.mw.models.MIMP5MRail;
import com.vicmatskiv.mw.models.MIMP5TRRail;
import com.vicmatskiv.mw.models.MLOKExtendedHandguard;
import com.vicmatskiv.mw.models.MLOKHandguard;
import com.vicmatskiv.mw.models.MP5A3RetractableStock;
import com.vicmatskiv.mw.models.MP5A4Stock;
import com.vicmatskiv.mw.models.MP5A5HandGuard;
import com.vicmatskiv.mw.models.MP5HOGUEGrip;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MP5SDHandGuard;
import com.vicmatskiv.mw.models.MagpulCTRStock;
import com.vicmatskiv.mw.models.MagpulHandleGuard;
import com.vicmatskiv.mw.models.MakarovPBBody;
import com.vicmatskiv.mw.models.MakarovPBSSilencer;
import com.vicmatskiv.mw.models.MakarovPBSSlide;
import com.vicmatskiv.mw.models.MakarovPM;
import com.vicmatskiv.mw.models.MakarovPMSlide;
import com.vicmatskiv.mw.models.MicroReflexSight;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.MilSpecStock;
import com.vicmatskiv.mw.models.Mk14Body;
import com.vicmatskiv.mw.models.Mk18HandGuard;
import com.vicmatskiv.mw.models.NTW20Guard;
import com.vicmatskiv.mw.models.NightRaiderScope;
import com.vicmatskiv.mw.models.OKP7;
import com.vicmatskiv.mw.models.OKP7reticle;
import com.vicmatskiv.mw.models.OSIPRLaser;
import com.vicmatskiv.mw.models.OSIPRMount;
import com.vicmatskiv.mw.models.OSIPRSight;
import com.vicmatskiv.mw.models.OSIPRminiscope;
import com.vicmatskiv.mw.models.OSIPRscopereticle;
import com.vicmatskiv.mw.models.Origin12Grip;
import com.vicmatskiv.mw.models.Origin12Handguard;
import com.vicmatskiv.mw.models.Origin12Stock;
import com.vicmatskiv.mw.models.P226Slide;
import com.vicmatskiv.mw.models.P226frontsight;
import com.vicmatskiv.mw.models.P226rearsight;
import com.vicmatskiv.mw.models.P90DefaultKit;
import com.vicmatskiv.mw.models.P90Swordfish;
import com.vicmatskiv.mw.models.P90Terminator;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PSO1;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.PSO1reticle;
import com.vicmatskiv.mw.models.R870part;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.RPK16handguard;
import com.vicmatskiv.mw.models.RPKbarrel;
import com.vicmatskiv.mw.models.RPKstock;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.Remington700Chassis;
import com.vicmatskiv.mw.models.Remington870Barrel;
import com.vicmatskiv.mw.models.Remington870FABDefensePump;
import com.vicmatskiv.mw.models.Remington870MagpulPump;
import com.vicmatskiv.mw.models.Remington870PoliceMagnumBarrel;
import com.vicmatskiv.mw.models.Remington870PoliceMagnumPump;
import com.vicmatskiv.mw.models.Remington870PoliceMagnumStock;
import com.vicmatskiv.mw.models.Remington870Pump;
import com.vicmatskiv.mw.models.Remington870SawedBarrel;
import com.vicmatskiv.mw.models.Remington870SawedGrip;
import com.vicmatskiv.mw.models.Remington870Stock;
import com.vicmatskiv.mw.models.SA58DustCover;
import com.vicmatskiv.mw.models.SOCOM_Stock;
import com.vicmatskiv.mw.models.SRS99Reticle;
import com.vicmatskiv.mw.models.SRS99Scope;
import com.vicmatskiv.mw.models.SSG08Chassis;
import com.vicmatskiv.mw.models.SamuraiEdge;
import com.vicmatskiv.mw.models.SamuraiEdgeAlbertExt;
import com.vicmatskiv.mw.models.SamuraiEdgeSlide;
import com.vicmatskiv.mw.models.SamuraiEdgeWesker;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.ScarStock;
import com.vicmatskiv.mw.models.ScorpionEVO3A1HandguardLong;
import com.vicmatskiv.mw.models.ScorpionEVO3A1HandguardShort;
import com.vicmatskiv.mw.models.ScorpionFrontSight;
import com.vicmatskiv.mw.models.ScorpionRearSight;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.mw.models.Spas12Stock;
import com.vicmatskiv.mw.models.SpecterSight;
import com.vicmatskiv.mw.models.StonerHANDGUARD;
import com.vicmatskiv.mw.models.StubbyGrip;
import com.vicmatskiv.mw.models.SupernovaRail;
import com.vicmatskiv.mw.models.Suppressor;
import com.vicmatskiv.mw.models.Suppressor300AACBlackout;
import com.vicmatskiv.mw.models.Suppressor45ACP;
import com.vicmatskiv.mw.models.Suppressor556x39;
import com.vicmatskiv.mw.models.Suppressor556x45;
import com.vicmatskiv.mw.models.Suppressor762x39;
import com.vicmatskiv.mw.models.Suppressor762x51;
import com.vicmatskiv.mw.models.TritiumRearSights;
import com.vicmatskiv.mw.models.UMP45;
import com.vicmatskiv.mw.models.UMP45Stock;
import com.vicmatskiv.mw.models.USPMatchCompensator;
import com.vicmatskiv.mw.models.UTGTriRailHandGuard;
import com.vicmatskiv.mw.models.VGrip;
import com.vicmatskiv.mw.models.VLTORReceiver;
import com.vicmatskiv.mw.models.VP70stock;
import com.vicmatskiv.mw.models.VeprDustCover;
import com.vicmatskiv.mw.models.VortexSight;
import com.vicmatskiv.mw.models.Written45ACP;
import com.vicmatskiv.mw.models.makarovfrontsight;
import com.vicmatskiv.mw.models.makarovrearsight;
import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemScope;
import com.vicmatskiv.weaponlib.LaserBeamRenderer;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import org.lwjgl.opengl.GL11;

public class Attachments {
    public static ItemAttachment<Weapon> OKP7;
    public static ItemAttachment<Weapon> PSO1;
    public static ItemAttachment<Weapon> Reflex;
    public static ItemAttachment<Weapon> BijiaReflex;
    public static ItemAttachment<Weapon> Holographic;
    public static ItemAttachment<Weapon> HolographicAlt;
    public static ItemAttachment<Weapon> EotechHybrid2;
    public static ItemAttachment<Weapon> VortexRedux;
    public static ItemAttachment<Weapon> Kobra;
    public static ItemAttachment<Weapon> KobraGen3;
    public static ItemAttachment<Weapon> MicroReflex;
    public static ItemAttachment<Weapon> ACOG;
    public static ItemAttachment<Weapon> Specter;
    public static ItemAttachment<Weapon> HP;
    public static ItemAttachment<Weapon> LeupoldRailScope;
    public static ItemAttachment<Weapon> AX50Scope;
    public static ItemAttachment<Weapon> NightRaider;
    public static ItemAttachment<Weapon> M2A1sight;
    public static ItemAttachment<Weapon> F2000Scope;
    public static ItemAttachment<Weapon> MA5Dcover;
    public static ItemAttachment<Weapon> BR55Scope;
    public static ItemAttachment<Weapon> DMRScope;
    public static ItemAttachment<Weapon> SRS99Scope;
    public static ItemAttachment<Weapon> Silencer556x45;
    public static ItemAttachment<Weapon> Silencer762x39;
    public static ItemAttachment<Weapon> Silencer556x39;
    public static ItemAttachment<Weapon> Silencer545x39;
    public static ItemAttachment<Weapon> Silencer50BMG;
    public static ItemAttachment<Weapon> SilencerPBS;
    public static ItemAttachment<Weapon> Silencer9mm;
    public static ItemAttachment<Weapon> SilencerMP5;
    public static ItemAttachment<Weapon> Silencer762x54;
    public static ItemAttachment<Weapon> Silencer762x51;
    public static ItemAttachment<Weapon> Silencer45ACP;
    public static ItemAttachment<Weapon> SilencerEABH;
    public static ItemAttachment<Weapon> Silencer12Gauge;
    public static ItemAttachment<Weapon> Silencer65x39;
    public static ItemAttachment<Weapon> Silencer57x38;
    public static ItemAttachment<Weapon> Silencer300AACBlackout;
    public static ItemAttachment<Weapon> HoneyBadgerSilencer;
    public static ItemAttachment<Weapon> Silencer357;
    public static ItemAttachment<Weapon> SilencerMP7;
    public static ItemAttachment<Weapon> Silencer9x39mm;
    public static ItemAttachment<Weapon> Laser;
    public static ItemAttachment<Weapon> Laser2;
    public static ItemAttachment<Weapon> DanWessonLaser;
    public static ItemAttachment<Weapon> OSIPRLaser;
    public static ItemAttachment<Weapon> Grip2;
    public static ItemAttachment<Weapon> AngledGrip;
    public static ItemAttachment<Weapon> JunoGrip;
    public static ItemAttachment<Weapon> StubbyGrip;
    public static ItemAttachment<Weapon> VGrip;
    public static ItemAttachment<Weapon> Bipod;
    public static ItemAttachment<Weapon> AUGgrip;
    public static ItemAttachment<Weapon> USPMatchCompensator;
    public static ItemAttachment<Weapon> AKMIron;
    public static ItemAttachment<Weapon> MicroT1;
    public static ItemAttachment<Weapon> AimpointCompM5;
    public static ItemAttachment<Weapon> RMR;
    public static ItemAttachment<Weapon> AK15ironsight;
    public static ItemAttachment<Weapon> AK12ironsight;
    public static ItemAttachment<Weapon> M202scope;
    public static ItemAttachment<Weapon> AUGscope;
    public static ItemAttachment<Weapon> M1928Grip;
    public static ItemAttachment<Weapon> M1A1Grip;
    public static ItemAttachment<Weapon> G36KScope;
    public static ItemAttachment<Weapon> LeupoldScope;
    public static ItemAttachment<Weapon> TritiumRearSights;
    public static ItemAttachment<Weapon> MBUSRearSights;
    public static ItemAttachment<Weapon> HK416RearSights;
    public static ItemAttachment<Weapon> FNFALRearSights;
    public static ItemAttachment<Weapon> M16A1RearSights;
    public static ItemAttachment<Weapon> OSIPRMiniScope;
    public static ItemAttachment<Weapon> OSIPRSight;
    public static ItemAttachment<Weapon> K2C1RearSights;
    public static ItemAttachment<Weapon> ScorpionRearSight;
    public static ItemAttachment<Weapon> ScorpionFrontSight;
    public static ItemAttachment<Weapon> AKMDustCover;
    public static ItemAttachment<Weapon> VeprDustCover;
    public static ItemAttachment<Weapon> AK101DustCover;
    public static ItemAttachment<Weapon> AK15DustCover;
    public static ItemAttachment<Weapon> RPKDustCover;
    public static ItemAttachment<Weapon> FNFALDustCover;
    public static ItemAttachment<Weapon> FNFALGrip;
    public static ItemAttachment<Weapon> FNFALStock;
    public static ItemAttachment<Weapon> FNFALHandguard;
    public static ItemAttachment<Weapon> SA58DustCover;
    public static ItemAttachment<Weapon> FNFALPARAHandguard;
    public static ItemAttachment<Weapon> AK47HandleGuard;
    public static ItemAttachment<Weapon> AK101HandGuard;
    public static ItemAttachment<Weapon> AKMagpulHandleGuard;
    public static ItemAttachment<Weapon> AKMagpulHandleGuardTan;
    public static ItemAttachment<Weapon> MLOKHandguard;
    public static ItemAttachment<Weapon> MLOKExtendedHandguard;
    public static ItemAttachment<Weapon> AK15HandleGuard;
    public static ItemAttachment<Weapon> RPK16Handguard;
    public static ItemAttachment<Weapon> M4HandGuard;
    public static ItemAttachment<Weapon> M16HandGuard;
    public static ItemAttachment<Weapon> M4MagpulHandGuard;
    public static ItemAttachment<Weapon> M4MagpulHandGuardTan;
    public static ItemAttachment<Weapon> M4CarbineHandGuard;
    public static ItemAttachment<Weapon> M16A4HandGuard;
    public static ItemAttachment<Weapon> AR10SuperSASSHandguard;
    public static ItemAttachment<Weapon> C8SFWHandguard;
    public static ItemAttachment<Weapon> LVOAVHandGuard;
    public static ItemAttachment<Weapon> M38HandGuard;
    public static ItemAttachment<Weapon> Mk18HandGuard;
    public static ItemAttachment<Weapon> Block2SOCOMHandguard;
    public static ItemAttachment<Weapon> M16A1Handguard;
    public static ItemAttachment<Weapon> K2C1Handguard;
    public static ItemAttachment<Weapon> MP5A5HandGuard;
    public static ItemAttachment<Weapon> MP5SDHandGuard;
    public static ItemAttachment<Weapon> MIMP5MHandGuard;
    public static ItemAttachment<Weapon> UTGTriRailHandGuard;
    public static ItemAttachment<Weapon> ScorpionHandguardShort;
    public static ItemAttachment<Weapon> ScorpionHandguardLong;
    public static ItemAttachment<Weapon> ScarHandGuard;
    public static ItemAttachment<Weapon> ACRHandGuard;
    public static ItemAttachment<Weapon> ACRHandGuardBlack;
    public static ItemAttachment<Weapon> ACRWEMSKHandGuard;
    public static ItemAttachment<Weapon> ACRWEMSKHandGuardTan;
    public static ItemAttachment<Weapon> ACRPrecisionHandGuard;
    public static ItemAttachment<Weapon> ACRPrecisionHandGuardTan;
    public static ItemAttachment<Weapon> ACRSBRHandGuard;
    public static ItemAttachment<Weapon> ACRSBRHandGuardTan;
    public static ItemAttachment<Weapon> ACRPolymerHandGuard;
    public static ItemAttachment<Weapon> ACRPolymerHandGuardTan;
    public static ItemAttachment<Weapon> ACRSquareDropHandguard;
    public static ItemAttachment<Weapon> ACRSquareDropHandguardTan;
    public static ItemAttachment<Weapon> HoneyBadgerHandguard;
    public static ItemAttachment<Weapon> HoneyBadgerMatrixArmsHandguard;
    public static ItemAttachment<Weapon> M60HandGuard;
    public static ItemAttachment<Weapon> M60E4HandGuard;
    public static ItemAttachment<Weapon> M249HandGuard;
    public static ItemAttachment<Weapon> AUGA1handguard;
    public static ItemAttachment<Weapon> AUGA2handguard;
    public static ItemAttachment<Weapon> AUGA3handguard;
    public static ItemAttachment<Weapon> AUGA3extGuard;
    public static ItemAttachment<Weapon> StonerHANDGUARD;
    public static ItemAttachment<Weapon> AR57Handguard;
    public static ItemAttachment<Weapon> NTW20HandguardRAIL;
    public static ItemAttachment<Weapon> EF88Handguard;
    public static ItemAttachment<Weapon> AUGDefaultKit;
    public static ItemAttachment<Weapon> AUGParaConversion;
    public static ItemAttachment<Weapon> VectorHandguard;
    public static ItemAttachment<Weapon> Vector556Handguard;
    public static ItemAttachment<Weapon> VectorSwordfish;
    public static ItemAttachment<Weapon> Remington870Barrel;
    public static ItemAttachment<Weapon> Remington870SawedOffBarrel;
    public static ItemAttachment<Weapon> Remington870PoliceMagnumBarrel;
    public static ItemAttachment<Weapon> M1CarbineHandguard;
    public static ItemAttachment<Weapon> M1CarbineVentilatedHandguard;
    public static ItemAttachment<Weapon> M1CarbineScoutHandguard;
    public static ItemAttachment<Weapon> Origin12Handguard;
    public static ItemAttachment<Weapon> HKS20Handguard;
    public static ItemAttachment<Weapon> Remington700Chassis;
    public static ItemAttachment<Weapon> SSG08Chassis;
    public static ItemAttachment<Weapon> ARX160Chassis;
    public static ItemAttachment<Weapon> ARX160ChassisOlive;
    public static ItemAttachment<Weapon> ARX160ChassisTan;
    public static ItemAttachment<Weapon> G2ContenderBarrelShort;
    public static ItemAttachment<Weapon> G2ContenderBarrelLong;
    public static ItemAttachment<Weapon> G2ContenderGrip;
    public static ItemAttachment<Weapon> G2ContenderStock;
    public static ItemAttachment<Weapon> HoneyBadgerStock;
    public static ItemAttachment<Weapon> HoneyBadgerStockBlack;
    public static ItemAttachment<Weapon> AK47Stock;
    public static ItemAttachment<Weapon> RPKStock;
    public static ItemAttachment<Weapon> AK101Stock;
    public static ItemAttachment<Weapon> CollapsableMOEStock;
    public static ItemAttachment<Weapon> MagpulCTRStock;
    public static ItemAttachment<Weapon> MilSpecStock;
    public static ItemAttachment<Weapon> C8Stock;
    public static ItemAttachment<Weapon> HeraArmsStock;
    public static ItemAttachment<Weapon> HK416Stock;
    public static ItemAttachment<Weapon> SOCOM_Stock;
    public static ItemAttachment<Weapon> M4AsiimovStock;
    public static ItemAttachment<Weapon> M16Stock;
    public static ItemAttachment<Weapon> MagpulCTRStockTan;
    public static ItemAttachment<Weapon> MilSpecStockTan;
    public static ItemAttachment<Weapon> HK416StockTan;
    public static ItemAttachment<Weapon> M16StockTan;
    public static ItemAttachment<Weapon> PRSPrecisionStock;
    public static ItemAttachment<Weapon> MP5A3Stock;
    public static ItemAttachment<Weapon> MP5A4Stock;
    public static ItemAttachment<Weapon> ScarStock;
    public static ItemAttachment<Weapon> ScarHStock;
    public static ItemAttachment<Weapon> ACRStock;
    public static ItemAttachment<Weapon> ACRStockBlack;
    public static ItemAttachment<Weapon> ACRPRSStock;
    public static ItemAttachment<Weapon> ACRPRSStockTan;
    public static ItemAttachment<Weapon> ACRFixedStock;
    public static ItemAttachment<Weapon> ACRFixedStockTan;
    public static ItemAttachment<Weapon> ACRLongRangeStock;
    public static ItemAttachment<Weapon> ACRPDWStock;
    public static ItemAttachment<Weapon> M1014Stock;
    public static ItemAttachment<Weapon> M4BenelliStock;
    public static ItemAttachment<Weapon> Spas12Stock;
    public static ItemAttachment<Weapon> M249Stock;
    public static ItemAttachment<Weapon> VectorStock;
    public static ItemAttachment<Weapon> UMP45Receiver;
    public static ItemAttachment<Weapon> UMP9Receiver;
    public static ItemAttachment<Weapon> UMP45Stock;
    public static ItemAttachment<Weapon> GlockStock;
    public static ItemAttachment<Weapon> VP70Stock;
    public static ItemAttachment<Weapon> Remington870Stock;
    public static ItemAttachment<Weapon> Remington870SawedGrip;
    public static ItemAttachment<Weapon> Remington870PoliceMagnumStock;
    public static ItemAttachment<Weapon> Remington870MilspecStock;
    public static ItemAttachment<Weapon> Remington870HK416Stock;
    public static ItemAttachment<Weapon> M1CarbineBody;
    public static ItemAttachment<Weapon> M1A1CarbineBody;
    public static ItemAttachment<Weapon> M14Body;
    public static ItemAttachment<Weapon> Mk14TanBody;
    public static ItemAttachment<Weapon> Mk14SnowBody;
    public static ItemAttachment<Weapon> Mk14BlackBody;
    public static ItemAttachment<Weapon> M14Cover;
    public static ItemAttachment<Weapon> M14TriRailCover;
    public static ItemAttachment<Weapon> M14Rail;
    public static ItemAttachment<Weapon> Origin12Stock;
    public static ItemAttachment<Weapon> HKS20Stock;
    public static ItemAttachment<Weapon> MAC10Stock;
    public static ItemAttachment<Weapon> AK47Grip;
    public static ItemAttachment<Weapon> AK101Grip;
    public static ItemAttachment<Weapon> AKErgoGrip;
    public static ItemAttachment<Weapon> M4Grip;
    public static ItemAttachment<Weapon> M4GripTan;
    public static ItemAttachment<Weapon> SOCOM_Grip;
    public static ItemAttachment<Weapon> M4GripGray;
    public static ItemAttachment<Weapon> HeraArmsGrip;
    public static ItemAttachment<Weapon> MP5HOGUEGrip;
    public static ItemAttachment<Weapon> GlockHOGUEGrip;
    public static ItemAttachment<Weapon> GlockHOGUEGripTan;
    public static ItemAttachment<Weapon> Origin12Grip;
    public static ItemAttachment<Weapon> HKS20Grip;
    public static ItemAttachment<Weapon> K2C1Grip;
    public static ItemAttachment<Weapon> MAC10Grip;
    public static ItemAttachment<Weapon> M4Receiver;
    public static ItemAttachment<Weapon> VLTORReceiver;
    public static ItemAttachment<Weapon> AR57Receiver;
    public static ItemAttachment<Weapon> C8SFWReceiver;
    public static ItemAttachment<Weapon> MAC10Body;
    public static ItemAttachment<Weapon> HoneyBadgerReceiver;
    public static ItemAttachment<Weapon> HoneyBadgerReceiverBlack;
    public static ItemAttachment<Weapon> HoneyBadgerKnightsReceiver;
    public static ItemAttachment<Weapon> HoneyBadgerKnightsReceiverBlack;
    public static ItemAttachment<Weapon> OSIPRMount;
    public static ItemAttachment<Weapon> MIMP5TRRail;
    public static ItemAttachment<Weapon> MIMP5MRail;
    public static ItemAttachment<Weapon> ShotgunRail;
    public static ItemAttachment<Weapon> Kar98Krail;
    public static ItemAttachment<Weapon> M60Rail;
    public static ItemAttachment<Weapon> M16A1ScopeMount;
    public static ItemAttachment<Weapon> M16A1PicatinnyRail;
    public static ItemAttachment<Weapon> RailRiser;
    public static ItemAttachment<Weapon> M1911Slide;
    public static ItemAttachment<Weapon> M1911Body;
    public static ItemAttachment<Weapon> M191144MagSlide;
    public static ItemAttachment<Weapon> M191144MagBody;
    public static ItemAttachment<Weapon> M9A1Slide;
    public static ItemAttachment<Weapon> M9A1Body;
    public static ItemAttachment<Weapon> SamuraiEdgeSlide;
    public static ItemAttachment<Weapon> SamuraiEdgeBody;
    public static ItemAttachment<Weapon> SamuraiEdgeAWBody;
    public static ItemAttachment<Weapon> SamuraiEdgeAlbertExt;
    public static ItemAttachment<Weapon> DesertEagleBody;
    public static ItemAttachment<Weapon> DesertEagleSlide;
    public static ItemAttachment<Weapon> DesertEagleLongBody;
    public static ItemAttachment<Weapon> Glock19Body;
    public static ItemAttachment<Weapon> Glock18CBody;
    public static ItemAttachment<Weapon> Glock19XBody;
    public static ItemAttachment<Weapon> Glock19RazorbackBody;
    public static ItemAttachment<Weapon> Glock19Slide;
    public static ItemAttachment<Weapon> Glock19XSlide;
    public static ItemAttachment<Weapon> Glock19RazorbackSlide;
    public static ItemAttachment<Weapon> Glock19RockSlideGray;
    public static ItemAttachment<Weapon> Glock19RockSlideOlive;
    public static ItemAttachment<Weapon> Glock19GhostPrecisionSlide;
    public static ItemAttachment<Weapon> Glock18CSlide;
    public static ItemAttachment<Weapon> Glock18CCNCSlide;
    public static ItemAttachment<Weapon> P226Slide;
    public static ItemAttachment<Weapon> MakarovBody;
    public static ItemAttachment<Weapon> MakarovPBBody;
    public static ItemAttachment<Weapon> MakarovSlide;
    public static ItemAttachment<Weapon> MakarovPBSlide;
    public static ItemAttachment<Weapon> P90Swordfish;
    public static ItemAttachment<Weapon> P90DefaultKit;
    public static ItemAttachment<Weapon> P90Terminator;
    public static ItemAttachment<Weapon> FABDefenseMount;
    public static ItemAttachment<Weapon> M4FrontSight;
    public static ItemAttachment<Weapon> M38FrontSight;
    public static ItemAttachment<Weapon> HK416FrontSight;
    public static ItemAttachment<Weapon> MBUSFrontSight;
    public static ItemAttachment<Weapon> Kar98Ksight;
    public static ItemAttachment<Weapon> M32Barrel;
    public static ItemAttachment<Weapon> M60FrontSight;
    public static ItemAttachment<Weapon> RPKBarrel;
    public static ItemAttachment<Weapon> AKIron;
    public static ItemAttachment<Weapon> Remington870Pump;
    public static ItemAttachment<Weapon> Remington870PoliceMagnumPump;
    public static ItemAttachment<Weapon> Remington870MagpulPump;
    public static ItemAttachment<Weapon> Remington870FABDefensePump;
    public static ItemAttachment<Weapon> Placeholder;
    public static ItemAttachment<Weapon> APC9Placeholder;
    public static ItemAttachment<Weapon> P90Placeholder;
    public static ItemAttachment<Weapon> PistolPlaceholder;
    public static ItemAttachment<Weapon> GripPlaceholder;
    public static ItemAttachment<Weapon> LaserPlaceholder;
    public static ItemAttachment<Weapon> MAC10Action;

    /*
     * Opcode count of 13881 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        FABDefenseMount = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new FABDefenseMount(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof FABDefenseMount) {
                GL11.glTranslatef((float)-0.6f, (float)-0.3f, (float)1.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FABDefenseMount) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FABDefenseMount) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("FABDefenseMount").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        P90Swordfish = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new P90Swordfish(), "p90.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withModel(new AKRail4(), "gun.png").withModel(new AKRail5(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof P90Swordfish) {
                GL11.glTranslatef((float)-0.6f, (float)0.1f, (float)-0.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof P90Swordfish) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof P90Swordfish) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("P90swordfish").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        P90DefaultKit = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new P90DefaultKit(), "p90.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof P90DefaultKit) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof P90DefaultKit) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof P90DefaultKit) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("P90DefaultKit").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        P90Terminator = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new P90Terminator(), "p90.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof P90Terminator) {
                GL11.glTranslatef((float)-0.6f, (float)0.1f, (float)1.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof P90Terminator) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof P90Terminator) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("P90Terminator").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ScarHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.6f, (float)-0.8f, (float)1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ScarHandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        VectorHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new KrissVectorHandguard(), "krissvector.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof KrissVectorHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)-1.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KrissVectorHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KrissVectorHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("KrissVectorHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        VectorSwordfish = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new KrissVectorSwordfish(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof KrissVectorSwordfish) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-1.8f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KrissVectorSwordfish) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KrissVectorSwordfish) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("KrissVectorSwordfish").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Vector556Handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new KrissVectorModified(), "krissvectormodified.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof KrissVectorModified) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)-1.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KrissVectorModified) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KrissVectorModified) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("KrissVector556Handguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Origin12Handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Origin12Handguard(), "origin12.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Origin12Handguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Origin12Handguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Origin12Handguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Origin12Handguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HKS20Handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new HKS20Handguard(), "hks20.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof HKS20Handguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HKS20Handguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HKS20Handguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HKS20Handguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington700Chassis = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Remington700Chassis(), "gun2.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Remington700Chassis) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)0.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington700Chassis) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington700Chassis) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Remington700Chassis").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SSG08Chassis = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new SSG08Chassis(), "SSG08_2.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof SSG08Chassis) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.43f, (double)0.43f, (double)0.43f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SSG08Chassis) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SSG08Chassis) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("SSG08Chassis").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ARX160Chassis = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ARX160(), "arx160.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ARX160) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.43f, (double)0.43f, (double)0.43f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ARX160) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ARX160) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ARX160Chassis").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ARX160ChassisOlive = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ARX160(), "arx160olive.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ARX160) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.43f, (double)0.43f, (double)0.43f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ARX160) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ARX160) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ARX160ChassisOlive").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ARX160ChassisTan = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ARX160(), "arx160tan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ARX160) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.43f, (double)0.43f, (double)0.43f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ARX160) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ARX160) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ARX160ChassisTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        G2ContenderBarrelShort = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new G2ContenderBarrelShort(), "g2contender.png").withModel(new AK47iron(), "gun.png").withModel(new FALIron(), "gun.png").withRenderablePart().withInventoryModelPositioning((model, s) -> {
            if (model instanceof G2ContenderBarrelShort) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.43f, (double)0.43f, (double)0.43f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G2ContenderBarrelShort) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G2ContenderBarrelShort) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("G2ContenderBarrelShort").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        G2ContenderBarrelLong = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new G2ContenderBarrelLong(), "g2contender.png").withModel(new AKRail(), "gun.png").withModel(new AK47iron(), "gun.png").withModel(new FALIron(), "gun.png").withRenderablePart().withInventoryModelPositioning((model, s) -> {
            if (model instanceof G2ContenderBarrelLong) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.43f, (double)0.43f, (double)0.43f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G2ContenderBarrelLong) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G2ContenderBarrelLong) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("G2ContenderBarrelLong").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        G2ContenderGrip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new G2ContenderGrip(), "g2contender.png").withRenderablePart().withInventoryModelPositioning((model, s) -> {
            if (model instanceof G2ContenderGrip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.43f, (double)0.43f, (double)0.43f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G2ContenderGrip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G2ContenderGrip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("G2ContenderGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        G2ContenderStock = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new G2ContenderStock(), "g2contender.png").withRenderablePart().withInventoryModelPositioning((model, s) -> {
            if (model instanceof G2ContenderStock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.43f, (double)0.43f, (double)0.43f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G2ContenderStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G2ContenderStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("G2ContenderStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Origin12Grip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Origin12Grip(), "origin12.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Origin12Grip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Origin12Grip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Origin12Grip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Origin12Grip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HKS20Grip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new HKS20Grip(), "HKS20.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof HKS20Grip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HKS20Grip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HKS20Grip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HKS20Grip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Origin12Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Origin12Stock(), "origin12.png").withRequiredAttachments(Origin12Grip).withInventoryModelPositioning((model, s) -> {
            if (model instanceof Origin12Stock) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Origin12Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Origin12Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Origin12Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HKS20Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new HKS20Stock(), "HKS20.png").withRequiredAttachments(HKS20Grip).withInventoryModelPositioning((model, s) -> {
            if (model instanceof HKS20Stock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HKS20Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HKS20Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HKS20Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRHandGuard(), "acr.png").withModel(new AKRail(), "acrrail.png").withModel(new AKRail2(), "acrrail.png").withModel(new AKRail3(), "acrrail.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRHandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRHandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRHandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRHandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRHandGuardBlack = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRHandGuard(), "acrblack.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRHandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRHandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRHandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRHandGuardBlack").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRWEMSKHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRWEMSKHandguard(), "ACRWEMSKHandguard.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRWEMSKHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRWEMSKHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRWEMSKHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRWEMSKHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRWEMSKHandGuardTan = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRWEMSKHandguard(), "ACRWEMSKHandguardtan.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRWEMSKHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRWEMSKHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRWEMSKHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRWEMSKHandguardTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRPrecisionHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRPrecisionHandguard(), "ACRPrecisionHandGuard.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRPrecisionHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPrecisionHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPrecisionHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRPrecisionHandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRPrecisionHandGuardTan = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRPrecisionHandguard(), "ACRPrecisionHandGuardTan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRPrecisionHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPrecisionHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPrecisionHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRPrecisionHandGuardTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRSBRHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRSBRHandguard(), "acrsbrhandguard.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRSBRHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRSBRHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRSBRHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRSBRHandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRSBRHandGuardTan = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRSBRHandguard(), "ACRSBRHandGuardtan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRSBRHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRSBRHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRSBRHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRSBRHandGuardTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRPolymerHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRPolymerHandguard(), "acrpolymerhandguard.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRPolymerHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPolymerHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPolymerHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRPolymerHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRPolymerHandGuardTan = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRPolymerHandguard(), "acrpolymerhandguardtan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRPolymerHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPolymerHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPolymerHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRPolymerHandguardTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRSquareDropHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRSquareDropHandguard(), "ACRSBRHandguard.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRSquareDropHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRSquareDropHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRSquareDropHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRSquareDropHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRSquareDropHandguardTan = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRSquareDropHandguard(), "ACRSBRHandguardtan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRSquareDropHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRSquareDropHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRSquareDropHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRSquareDropHandguardTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HoneyBadgerHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AACHoneyBadgerHandguard(), "AACHoneyBadger.png").withModel(new AKRail(), "aacrail_gray.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AACHoneyBadgerHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HoneyBadgerHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HoneyBadgerMatrixArmsHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AACMatrixArmsHandguard(), "aacMatrixArmsHandguard.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AACMatrixArmsHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACMatrixArmsHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACMatrixArmsHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HoneyBadgerMatrixArmsHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M60HandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M60HandGuard(), "m60.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M60HandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)-1.6f, (float)0.9f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M60HandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M60HandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M60HandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M60E4HandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M60E4Guard(), "m60.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M60E4Guard) {
                GL11.glTranslatef((float)-0.6f, (float)-1.3f, (float)0.9f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M60E4Guard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M60E4Guard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M60E4Guard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M249HandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M249HandGuard(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M249HandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)1.8f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M249HandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M249HandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M249HandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        StonerHANDGUARD = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new StonerHANDGUARD(), "gun.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof StonerHANDGUARD) {
                GL11.glTranslatef((float)-0.6f, (float)-0.4f, (float)1.1f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof StonerHANDGUARD) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof StonerHANDGUARD) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("StonerHANDGUARD").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AUGA1handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AUGA1(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AUGA1) {
                GL11.glTranslatef((float)-0.6f, (float)0.6f, (float)0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGA1) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGA1) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AUGA1").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AUGA2handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AUGA2(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AUGA2) {
                GL11.glTranslatef((float)-0.6f, (float)0.6f, (float)0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGA2) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGA2) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AUGA2handguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AUGA3handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AUGA3M1(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AUGA3M1) {
                GL11.glTranslatef((float)-0.6f, (float)0.6f, (float)0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGA3M1) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGA3M1) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AUGA3handguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        EF88Handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new EF88(), "aug.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof EF88) {
                GL11.glTranslatef((float)-0.6f, (float)-0.3f, (float)0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof EF88) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof EF88) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("EF88Handguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AUGDefaultKit = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AUG9mmCONVERSIONkit(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AUG9mmCONVERSIONkit) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)1.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUG9mmCONVERSIONkit) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUG9mmCONVERSIONkit) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AUGDefaultKit").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AUGParaConversion = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AUG9mmCONVERSIONkit(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AUG9mmCONVERSIONkit) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)1.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUG9mmCONVERSIONkit) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUG9mmCONVERSIONkit) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AUGParaConversion").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AUGA3extGuard = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AUGA3M1_Ext(), "gun.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withModel(new AKRail4(), "gun.png").withRequiredAttachments(AUGA3handguard).withInventoryModelPositioning((model, s) -> {
            if (model instanceof AUGA3M1_Ext) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGA3M1_Ext) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGA3M1_Ext) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AUGA3extGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M1CarbineBody = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M1CarbineBody(), "m1carbine.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M1CarbineBody) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1CarbineBody) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1CarbineBody) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M1CarbineBody").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M1A1CarbineBody = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M1A1CarbineStock(), "m1carbine.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M1A1CarbineStock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1A1CarbineStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1A1CarbineStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M1A1CarbineBody").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M1CarbineHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M1CarbineHandguard(), "m1carbine.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M1CarbineHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1CarbineHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1CarbineHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M1CarbineHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M1CarbineVentilatedHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M1CarbineVentilatedHandguard(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M1CarbineVentilatedHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1CarbineVentilatedHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1CarbineVentilatedHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M1CarbineVentilatedHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M1CarbineScoutHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M1ScoutCarbineHandguard(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M1ScoutCarbineHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1ScoutCarbineHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1ScoutCarbineHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M1ScoutCarbineHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M14Body = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M14Body(), "m14body.png").withModel(new FALIron(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M14Body) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M14Body) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M14Body) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M14Body").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Mk14TanBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Mk14Body(), "mk14tanbody.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Mk14Body) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Mk14Body) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Mk14Body) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Mk14TanBody").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Mk14SnowBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Mk14Body(), "mk14snowbody.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Mk14Body) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Mk14Body) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Mk14Body) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Mk14SnowBody").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Mk14BlackBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Mk14Body(), "mk14blackbody.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Mk14Body) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)-0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Mk14Body) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Mk14Body) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Mk14BlackBody").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M14Cover = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M14Cover(), "m14cover.png").withRequiredAttachments(M14Body).withInventoryModelPositioning((model, s) -> {
            if (model instanceof M14Cover) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-2.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M14Cover) {
                GL11.glTranslatef((float)1.5f, (float)-0.2f, (float)3.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M14Cover) {
                GL11.glTranslatef((float)-1.5f, (float)-2.0f, (float)1.5f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M14Cover").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M14TriRailCover = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M14TriRailCover(), "gun.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withRequiredAttachments(M14Body).withInventoryModelPositioning((model, s) -> {
            if (model instanceof M14TriRailCover) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-2.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M14TriRailCover) {
                GL11.glTranslatef((float)1.5f, (float)-0.2f, (float)3.0f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M14TriRailCover) {
                GL11.glTranslatef((float)-1.5f, (float)-2.0f, (float)1.5f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M14TriRailCover").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M14Rail = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRequiredAttachments(M14Body, Mk14TanBody, Mk14SnowBody, Mk14BlackBody).withModel(new M14DMRRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M14DMRRail) {
                GL11.glTranslatef((float)-0.6f, (float)-1.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M14DMRRail) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M14DMRRail) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M14Rail").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ScarStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ScarStock(), "scar.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ScarStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.8f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScarStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScarStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ScarStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ScarHStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ScarStock(), "scarh.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ScarStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.8f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScarStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScarStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ScarHStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        VectorStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new KrissVectorStock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof KrissVectorStock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KrissVectorStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KrissVectorStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("VectorStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        UMP45Receiver = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new UMP45(), "ump45.png").withModel(new Written45ACP(), "written45acp.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof UMP45) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof UMP45) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof UMP45) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("UMP45Receiver").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        UMP9Receiver = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new UMP45(), "ump45.png").withModel(new Written45ACP(), "written9x19mm.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof UMP45) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof UMP45) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof UMP45) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("UMP9Receiver").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        UMP45Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new UMP45Stock(), "ump45.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof UMP45Stock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof UMP45Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof UMP45Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("UMP45Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MAC10Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MAC10Stock(), "mac10.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MAC10Stock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MAC10Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MAC10Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MAC10Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRStock(), "acr.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRStockBlack = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRStock(), "acrblack.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRStockBlack").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRFixedStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRFixedStock(), "acrfixedstock.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRFixedStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRFixedStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRFixedStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRFixedStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRFixedStockTan = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRFixedStock(), "acrfixedstocktan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRFixedStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRFixedStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRFixedStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRFixedStockTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRPRSStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRPRSStock(), "acrprsstock.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRPRSStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPRSStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPRSStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRPRSStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRPRSStockTan = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRPRSStock(), "acrprsstocktan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRPRSStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPRSStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPRSStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRPRSStockTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRLongRangeStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRLongRangeStock(), "ACRLongRangeStock.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRLongRangeStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRLongRangeStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRLongRangeStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRLongRangeStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACRPDWStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACRPDWStock(), "ACRPDWStock.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ACRPDWStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPDWStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACRPDWStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ACRPDWStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M1014Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M1014stock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M1014stock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)2.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1014stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1014stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M1014Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4BenelliStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4BenelliStock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4BenelliStock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)2.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4BenelliStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4BenelliStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4BenelliStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Spas12Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Spas12Stock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Spas12Stock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Spas12Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Spas12Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Spas12Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M249Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M249Stock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M249Stock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.7f, (float)5.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M249Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M249Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M249Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        UTGTriRailHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new UTGTriRailHandGuard(), "gun.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof UTGTriRailHandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof UTGTriRailHandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof UTGTriRailHandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("UTGTriRailHandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MIMP5MHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MIMP5MHandGuard(), "magpulhandleguard.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MIMP5MHandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MIMP5MHandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MIMP5MHandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MIMP5MHandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ScorpionHandguardShort = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ScorpionEVO3A1HandguardShort(), "ScorpionEVO3A1.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withModel(new AKRail4(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ScorpionEVO3A1HandguardShort) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScorpionEVO3A1HandguardShort) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScorpionEVO3A1HandguardShort) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ScorpionEVO3A1HandguardShort").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ScorpionHandguardLong = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ScorpionEVO3A1HandguardLong(), "ScorpionEVO3A1.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ScorpionEVO3A1HandguardLong) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScorpionEVO3A1HandguardLong) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScorpionEVO3A1HandguardLong) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ScorpionEVO3A1HandguardLong").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        OSIPRMount = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new OSIPRMount(), "OSIPRmount.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof OSIPRMount) {
                GL11.glTranslatef((float)-0.6f, (float)-0.3f, (float)-0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.3f, (double)1.3f, (double)1.3f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRMount) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRMount) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("OSIPRMount").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MIMP5TRRail = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MIMP5TRRail(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MIMP5TRRail) {
                GL11.glTranslatef((float)-0.6f, (float)0.7f, (float)-0.8f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MIMP5TRRail) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MIMP5TRRail) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MIMP5TRRail").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MIMP5MRail = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MIMP5MRail(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MIMP5MRail) {
                GL11.glTranslatef((float)-0.6f, (float)1.2f, (float)-0.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MIMP5MRail) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MIMP5MRail) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MIMP5MRail").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ShotgunRail = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new SupernovaRail(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof SupernovaRail) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.3f, (double)1.3f, (double)1.3f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SupernovaRail) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SupernovaRail) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ShotgunRail").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Kar98Krail = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Kar98Krail(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Kar98Krail) {
                GL11.glTranslatef((float)-0.6f, (float)1.3f, (float)-2.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Kar98Krail) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Kar98Krail) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Kar98Krail").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M60Rail = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.6f, (float)-0.7f, (float)1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKRail) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M60Rail").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M16A1ScopeMount = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new M16A1ScopeMount(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M16A1ScopeMount) {
                GL11.glTranslatef((float)-0.6f, (float)3.0f, (float)-1.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16A1ScopeMount) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16A1ScopeMount) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M16A1ScopeMount").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M16A1PicatinnyRail = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new M16A1PicatinnyRail(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M16A1PicatinnyRail) {
                GL11.glTranslatef((float)-0.6f, (float)1.3f, (float)-5.1f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.8f, (double)1.8f, (double)1.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16A1PicatinnyRail) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16A1PicatinnyRail) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M16A1PicatinnyRail").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        RailRiser = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new KrissVectorRailRiser(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof KrissVectorRailRiser) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-0.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KrissVectorRailRiser) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KrissVectorRailRiser) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("RailRiser").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M1911Slide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M1911Slide(), "m1911.png").withModel(new M1911frontsight(), "gun").withModel(new makarovrearsight(), "gun").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M1911Slide) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1911Slide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1911Slide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M1911Slide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M1911Body = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M1911Body(), "m1911.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M1911Body) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.1f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1911Body) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1911Body) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M1911Body").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M191144MagSlide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M191144MagSlide(), "M191144MagSlide.png").withModel(new M1911frontsight(), "gun").withModel(new makarovrearsight(), "gun").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M191144MagSlide) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M191144MagSlide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M191144MagSlide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M191144MagSlide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M191144MagBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M191144MagBody(), "M191144Mag.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M191144MagBody) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M191144MagBody) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M191144MagBody) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M191144MagBody").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M9A1Slide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M9slide(), "m9slide.png").withModel(new M9A1frontsight(), "M9A1frontsight").withModel(new M9A1rearsight(), "M9A1rearsight").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M9slide) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M9slide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M9slide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M9A1Slide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M9A1Body = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M9(), "m9a1.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M9) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.1f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M9) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M9) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M9A1Body").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SamuraiEdgeSlide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new SamuraiEdgeSlide(), "samuraiedgeslide.png").withModel(new M9A1frontsight(), "M9A1frontsight").withModel(new M9A1rearsight(), "M9A1rearsight").withInventoryModelPositioning((model, s) -> {
            if (model instanceof SamuraiEdgeSlide) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SamuraiEdgeSlide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SamuraiEdgeSlide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("SamuraiEdgeSlide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SamuraiEdgeBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new SamuraiEdge(), "samuraiedge.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof SamuraiEdge) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.1f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SamuraiEdge) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SamuraiEdge) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("SamuraiEdgeBody").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SamuraiEdgeAWBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new SamuraiEdgeWesker(), "samuraiedgewesker.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof SamuraiEdgeWesker) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.1f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SamuraiEdgeWesker) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SamuraiEdgeWesker) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("SamuraiEdgeAWBody").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SamuraiEdgeAlbertExt = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new SamuraiEdgeAlbertExt(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof SamuraiEdgeAlbertExt) {
                GL11.glTranslatef((float)-0.6f, (float)0.1f, (float)-1.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SamuraiEdgeAlbertExt) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SamuraiEdgeAlbertExt) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("SamuraiEdgeAlbertExt").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        DesertEagleSlide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withModel(new DesertEagleSlide(), "DesertEagle.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof DesertEagleSlide) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DesertEagleSlide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DesertEagleSlide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("DesertEagleSlide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        DesertEagleBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new DesertEagle(), "DesertEagle.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof DesertEagle) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DesertEagle) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DesertEagle) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("DesertEagleBody").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        DesertEagleLongBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new DesertEagleLong(), "DesertEagle.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof DesertEagleLong) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DesertEagleLong) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DesertEagleLong) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("DesertEagleLongBody").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock19Body = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock19(), "glock19.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Glock19) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Glock19Body").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock18CBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock19(), "glock18c.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Glock19) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Glock18CBody").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock19XBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock19(), "glock19x.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Glock19) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Glock19XBody").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock19RazorbackBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new GlockRazorback(), "GlockRazorback.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof GlockRazorback) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof GlockRazorback) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof GlockRazorback) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("GlockRazorbackBody").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock19Slide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock19Slide(), "glock19.png").withModel(new M1911frontsight(), "m1911frontsight").withModel(new GlockRearSight(), "glockrearsight").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Glock19Slide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19Slide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19Slide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Glock19Slide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock18CSlide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock18Cslide(), "glock18cslide.png").withModel(new M1911frontsight(), "m1911frontsight").withModel(new GlockRearSight(), "glockrearsight").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Glock18Cslide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock18Cslide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock18Cslide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Glock18CSlide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock18CCNCSlide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock18CCNCslide(), "glock18ccncslide.png").withModel(new M1911frontsight(), "m1911frontsight").withModel(new GlockRearSight(), "glockrearsight").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Glock18CCNCslide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock18CCNCslide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock18CCNCslide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Glock18CCNCslide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock19XSlide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock19Slide(), "glock19x.png").withModel(new M1911frontsight(), "m1911frontsight").withModel(new GlockRearSight(), "glockrearsight").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Glock19Slide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19Slide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19Slide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Glock19XSlide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock19RazorbackSlide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new GlockRazorbackSlide(), "GlockRazorback.png").withModel(new M1911frontsight(), "m1911frontsight").withModel(new GlockRearSight(), "glockrearsight").withInventoryModelPositioning((model, s) -> {
            if (model instanceof GlockRazorbackSlide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof GlockRazorbackSlide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof GlockRazorbackSlide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("GlockRazorbackSlide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock19RockSlideGray = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock19Rockslide(), "Glock19Rockslidegray.png").withModel(new M1911frontsight(), "m1911frontsight").withModel(new GlockRearSight(), "glockrearsight").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Glock19Rockslide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19Rockslide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19Rockslide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Glock19Rockslidegray").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock19RockSlideOlive = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock19Rockslide(), "Glock19Rockslideolive.png").withModel(new M1911frontsight(), "m1911frontsight").withModel(new GlockRearSight(), "glockrearsight").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Glock19Rockslide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19Rockslide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19Rockslide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Glock19RockslideOlive").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Glock19GhostPrecisionSlide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock19GhostPrecisionSlide(), "Glock19GhostPrecisionSlide.png").withModel(new M1911frontsight(), "m1911frontsight").withModel(new GlockRearSight(), "glockrearsight").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Glock19GhostPrecisionSlide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19GhostPrecisionSlide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock19GhostPrecisionSlide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Glock19GhostPrecisionSlide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        P226Slide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new P226Slide(), "P226.png").withModel(new P226rearsight(), "p226rearsight.png").withModel(new P226frontsight(), "p226frontsight.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof P226Slide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof P226Slide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof P226Slide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("P226Slide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MakarovBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MakarovPM(), "makarovpm.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MakarovPM) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPM) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPM) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MakarovBody").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MakarovSlide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MakarovPMSlide(), "gun.png").withModel(new makarovrearsight(), "gun.png").withModel(new makarovfrontsight(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MakarovPMSlide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPMSlide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPMSlide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MakarovPMSlide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MakarovPBSlide = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MakarovPBSSlide(), "gun.png").withModel(new makarovrearsight(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MakarovPBSSlide) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPBSSlide) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPBSSlide) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MakarovPBSlide").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MakarovPBBody = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withRequiredAttachments(MakarovPBSlide).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MakarovPBBody(), "makarovpm.png").withModel(new makarovfrontsight(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MakarovPBBody) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPBBody) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPBBody) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MakarovPBBody").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MAC10Body = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MAC10Body(), "mac10.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MAC10Body) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MAC10Body) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MAC10Body) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MAC10Body").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MAC10Action = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MAC10Action(), "mac10.png").withRequiredAttachments(MAC10Body).withInventoryModelPositioning((model, s) -> {
            if (model instanceof MAC10Action) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MAC10Action) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MAC10Action) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MAC10Action").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MP5A5HandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MP5A5HandGuard(), "gun2.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MP5A5HandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MP5A5HandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MP5A5HandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MP5A5HandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MP5SDHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MP5SDHandGuard(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MP5SDHandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MP5SDHandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MP5SDHandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MP5SDHandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MP5HOGUEGrip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MP5HOGUEGrip(), "gun2.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MP5HOGUEGrip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MP5HOGUEGrip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MP5HOGUEGrip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MP5HOGUEGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        GlockHOGUEGrip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new GlockHogueGrip(), "gun2.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof GlockHogueGrip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.4f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof GlockHogueGrip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof GlockHogueGrip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("GlockHogueGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        GlockHOGUEGripTan = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new GlockHogueGrip(), "tan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof GlockHogueGrip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.4f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof GlockHogueGrip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof GlockHogueGrip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("GlockHogueGripTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MAC10Grip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MAC10Grip(), "mac10.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MAC10Grip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.4f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MAC10Grip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MAC10Grip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MAC10Grip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MP5A3Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MP5A3RetractableStock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MP5A3RetractableStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MP5A3RetractableStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MP5A3RetractableStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MP5A3Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MP5A4Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MP5A4Stock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MP5A4Stock) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MP5A4Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MP5A4Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MP5A4Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        LVOAVHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new LVOAVHandGuard(), "lvoavhandguard.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withModel(new AKRail5(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof LVOAVHandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof LVOAVHandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof LVOAVHandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("LVOAVHandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M38HandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M38HandGuard(), "gun.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withModel(new AKRail5(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M38HandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M38HandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M38HandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M38HandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Mk18HandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Mk18HandGuard(), "mk18handguard.png").withModel(new AKRail(), "tan_alt.png").withModel(new AKRail2(), "tan_alt.png").withModel(new AKRail3(), "tan_alt.png").withModel(new AKRail5(), "tan_alt.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Mk18HandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Mk18HandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Mk18HandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Mk18HandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Block2SOCOMHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withModel(new Block2SOCOMHandguard(), "block2socomhandguard.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withModel(new AKRail5(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof Block2SOCOMHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Block2SOCOMHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Block2SOCOMHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Block2SOCOMHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4MagpulHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4MagpulHandGuard(), "magpulhandleguard.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4MagpulHandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4MagpulHandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4MagpulHandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4MagpulHandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4MagpulHandGuardTan = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4MagpulHandGuard(), "magpulhandleguardtan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4MagpulHandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4MagpulHandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4MagpulHandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4MagpulHandGuardTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4Receiver = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4Receiver(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4Receiver) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Receiver) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Receiver) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4Receiver").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        C8SFWReceiver = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4Receiver(), "C8SFW_gun.png").withModel(new AKRail(), "C8SFW_gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4Receiver) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Receiver) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Receiver) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("C8SFWReceiver").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        VLTORReceiver = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new VLTORReceiver(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof VLTORReceiver) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof VLTORReceiver) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof VLTORReceiver) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("VLTORReceiver").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AR57Receiver = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AR57Receiver(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AR57Receiver) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AR57Receiver) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AR57Receiver) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AR57Receiver").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HoneyBadgerReceiver = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AACHoneyBadgerReceiver(), "AACHoneyBadger.png").withModel(new AKRail(), "aacrail_main.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AACHoneyBadgerReceiver) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerReceiver) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerReceiver) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HoneyBadgerReceiver").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HoneyBadgerReceiverBlack = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AACHoneyBadgerReceiver(), "AACHoneyBadgerBlack.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AACHoneyBadgerReceiver) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerReceiver) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerReceiver) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HoneyBadgerReceiverBlack").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HoneyBadgerKnightsReceiver = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AACKnightsArmamentReceiver(), "AACKnightsArmamentReceiver.png").withModel(new AKRail(), "aacrail_knights.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AACKnightsArmamentReceiver) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACKnightsArmamentReceiver) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACKnightsArmamentReceiver) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HoneyBadgerKnightsReceiver").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HoneyBadgerKnightsReceiverBlack = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AACKnightsArmamentReceiver(), "AACKnightsArmamentReceiverblack.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AACKnightsArmamentReceiver) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACKnightsArmamentReceiver) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACKnightsArmamentReceiver) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HoneyBadgerKnightsReceiverBlack").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Placeholder = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withModel(new M4Receiver(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Placeholder").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        APC9Placeholder = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withModel(new M4Receiver(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("APC9Placeholder").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        P90Placeholder = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withModel(new M4Receiver(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("P90Placeholder").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        PistolPlaceholder = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withModel(new M4Receiver(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("PistolPlaceholder").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        GripPlaceholder = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withModel(new M4Receiver(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("GripPlaceholder").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        LaserPlaceholder = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withModel(new M4Receiver(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof M4Receiver)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("LaserPlaceholder").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4HandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4HandGuard(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4HandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4HandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4HandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4HandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AR57Handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AR57Handguard(), "gun.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withRequiredAttachments(AR57Receiver).withInventoryModelPositioning((model, s) -> {
            if (model instanceof AR57Handguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AR57Handguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AR57Handguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AR57Handguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        NTW20HandguardRAIL = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new NTW20Guard(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof NTW20Guard) {
                GL11.glTranslatef((float)-0.6f, (float)-0.4f, (float)0.9f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof NTW20Guard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof NTW20Guard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("NTW20Guard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M16HandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M16HandGuard(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M16HandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16HandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16HandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M16HandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M16A1Handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M16A1Handguard(), "m16a1.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M16A1Handguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16A1Handguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16A1Handguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M16A1Handguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4CarbineHandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4CarbineHandGuard(), "gun.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withModel(new AKRail5(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4CarbineHandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4CarbineHandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4CarbineHandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4CarbineHandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M16A4HandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M16A4Handguard(), "gun.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withModel(new AKRail5(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M16A4Handguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.8f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16A4Handguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16A4Handguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M16A4HandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AR10SuperSASSHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AR10SuperSASSHandguard(), "gun.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withModel(new AKRail3(), "gun.png").withModel(new AKRail5(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AR10SuperSASSHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.8f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AR10SuperSASSHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AR10SuperSASSHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AR10SuperSASSHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        C8SFWHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new C8SFWHandguard(), "C8SFWHandguard.png").withModel(new AKRail(), "c8sfw_gun.png").withModel(new AKRail2(), "c8sfw_gun.png").withModel(new AKRail3(), "c8sfw_gun.png").withModel(new AKRail5(), "c8sfw_gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof C8SFWHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.3f, (float)-1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof C8SFWHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof C8SFWHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("C8SFWHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        K2C1Handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new K2C1Handguard(), "k2c1.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof K2C1Handguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-1.8f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof K2C1Handguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof K2C1Handguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("K2C1Handguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HeraArmsGrip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new HeraArmsGrip(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof HeraArmsGrip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HeraArmsGrip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HeraArmsGrip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HeraArmsGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4Grip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4Grip(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4Grip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4GripTan = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4Grip(), "tan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4GripTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SOCOM_Grip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withModel(new M4Grip(), "socom_grip.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("SOCOM_Grip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4GripGray = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4Grip(), "gun2.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Grip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4GripGray").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        K2C1Grip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new K2C1Grip(), "k2c1.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof K2C1Grip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof K2C1Grip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof K2C1Grip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("K2C1Grip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK47Grip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AKGrip(), "bareak.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AKGrip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKGrip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKGrip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK47Grip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK101Grip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AKGrip(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AKGrip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKGrip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKGrip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK101Grip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AKErgoGrip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AKErgoGrip(), "gun2.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AKErgoGrip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKErgoGrip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKErgoGrip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AKErgoGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HoneyBadgerStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new AACHoneyBadgerStock(), "AACHoneyBadger.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AACHoneyBadgerStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HoneyBadgerStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HoneyBadgerStockBlack = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new AACHoneyBadgerStock(), "AACHoneyBadgerblack.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AACHoneyBadgerStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HoneyBadgerStockBlack").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK47Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK47stock(), "bareak.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK47stock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK47stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK47stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK47stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        RPKStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new RPKstock(), "bareak.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof RPKstock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof RPKstock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof RPKstock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("RPKstock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK101Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK101Stock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK101Stock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK101Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK101Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK101Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        CollapsableMOEStock = new AttachmentBuilder().withRenderablePart().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new CollapsableMOEStock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof CollapsableMOEStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof CollapsableMOEStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof CollapsableMOEStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("CollapsableMOEStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MagpulCTRStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new MagpulCTRStock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MagpulCTRStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MagpulCTRStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MagpulCTRStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MagpulCTRStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MagpulCTRStockTan = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new MagpulCTRStock(), "tan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MagpulCTRStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MagpulCTRStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MagpulCTRStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MagpulCTRStockTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MilSpecStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new MilSpecStock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MilSpecStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        C8Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withRenderablePart().withModel(new MilSpecStock(), "C8Stock.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("C8Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MilSpecStockTan = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new MilSpecStock(), "tan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MilSpecStockTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HeraArmsStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new HeraArmsStock(), "gun.png").withRequiredAttachments(HeraArmsGrip).withInventoryModelPositioning((model, s) -> {
            if (model instanceof HeraArmsStock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HeraArmsStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HeraArmsStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HeraArmsStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HK416Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new HK416Stock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof HK416Stock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HK416Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HK416Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HK416Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SOCOM_Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withRenderablePart().withModel(new SOCOM_Stock(), "Socom_stock.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof SOCOM_Stock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SOCOM_Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SOCOM_Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("SOCOM_Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4AsiimovStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withRenderablePart().withModel(new M4AsiimovStock(), "m4a1asiimovstock.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4AsiimovStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4AsiimovStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4AsiimovStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4AsiimovStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M16Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M16Stock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M16Stock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)1.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M16Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HK416StockTan = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new HK416Stock(), "tan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof HK416Stock) {
                GL11.glTranslatef((float)-0.6f, (float)0.0f, (float)1.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HK416Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HK416Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HK416StockTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M16StockTan = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M16Stock(), "tan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M16Stock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)1.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16Stock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16Stock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M16StockTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        PRSPrecisionStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ARPRSPrecisionStock(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ARPRSPrecisionStock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.2f, (float)1.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ARPRSPrecisionStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ARPRSPrecisionStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ARPRSPrecisionStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK47HandleGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK47HandleGuard(), "bareak.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK47HandleGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-2.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK47HandleGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK47HandleGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK47HandleGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK101HandGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK101HandGuard(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK101HandGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-2.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK101HandGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK101HandGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK101HandGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AKMagpulHandleGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MagpulHandleGuard(), "MagpulHandleGuard.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MagpulHandleGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-2.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MagpulHandleGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MagpulHandleGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AKMagpulHandleGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AKMagpulHandleGuardTan = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MagpulHandleGuard(), "MagpulHandleGuardTan.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MagpulHandleGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-2.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MagpulHandleGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MagpulHandleGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AKMagpulHandleGuardTan").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MLOKHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MLOKHandguard(), "gun2.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MLOKHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-2.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MLOKHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MLOKHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MLOKHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MLOKExtendedHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MLOKExtendedHandguard(), "gun2.png").withModel(new AKRail(), "gun.png").withModel(new AKRail2(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof MLOKExtendedHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.2f, (float)-2.1f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MLOKExtendedHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MLOKExtendedHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MLOKExtendedHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK15HandleGuard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK15HandleGuard(), "gun2.png").withModel(new AKRail(), "gun2.png").withModel(new AKRail2(), "gun2.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK15HandleGuard) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-2.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK15HandleGuard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK15HandleGuard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK15HandleGuard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        RPK16Handguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new RPK16handguard(), "gun2.png").withModel(new AKRail(), "gun2.png").withModel(new AKRail2(), "gun2.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof RPK16handguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-2.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof RPK16handguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof RPK16handguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("RPK16handguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AKMDustCover = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK47DustCover(), "bareak.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK47DustCover) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK47DustCover) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK47DustCover) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK47Dustcover").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK101DustCover = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK101DustCover(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK101DustCover) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK101DustCover) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK101DustCover) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK101DustCover").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        RPKDustCover = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK101DustCover(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK101DustCover) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK101DustCover) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK101DustCover) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("RPKDustCover").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        VeprDustCover = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new VeprDustCover(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof VeprDustCover) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof VeprDustCover) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof VeprDustCover) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("VeprDustCover").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK15DustCover = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK15DustCover(), "gun.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK15DustCover) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK15DustCover) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK15DustCover) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK15DustCover").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        FNFALDustCover = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new FNFALDustCover(), "fnfal.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof FNFALDustCover) {
                GL11.glTranslatef((float)-0.6f, (float)0.6f, (float)-0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALDustCover) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALDustCover) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("FNFALDustCover").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SA58DustCover = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new SA58DustCover(), "SA58DustCover.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof SA58DustCover) {
                GL11.glTranslatef((float)-0.6f, (float)0.4f, (float)-0.2f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SA58DustCover) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SA58DustCover) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("SA58DustCover").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        FNFALGrip = new AttachmentBuilder().withCategory(AttachmentCategory.BACKGRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new FNFALGrip(), "fnfal.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof FNFALGrip) {
                GL11.glTranslatef((float)-0.6f, (float)-0.3f, (float)0.1f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALGrip) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALGrip) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("FNFALGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        FNFALStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new FNFALStock(), "fnfal.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof FNFALStock) {
                GL11.glTranslatef((float)-0.6f, (float)0.1f, (float)1.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALStock) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALStock) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("FNFALStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        FNFALHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new FNFALHandguard(), "fnfal.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof FNFALHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-2.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("FNFALHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        FNFALPARAHandguard = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new FNFALPARAHandguard(), "fnfalparahandguard.png").withModel(new AKRail(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof FNFALPARAHandguard) {
                GL11.glTranslatef((float)-0.6f, (float)0.5f, (float)-2.4f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALPARAHandguard) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALPARAHandguard) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("FNFALPARAHandguard").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M4FrontSight = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4Iron2(), "gun.png").withModel(new FALIron(), "gun.png").withRequiredAttachments(M4HandGuard, M4CarbineHandGuard, M4MagpulHandGuard, M4MagpulHandGuardTan, M16HandGuard, Mk18HandGuard, M16A4HandGuard).withInventoryModelPositioning((model, s) -> {
            if (model instanceof M4Iron2) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)0.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.6f, (double)1.6f, (double)1.6f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Iron2) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M4Iron2) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M4FrontSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M60FrontSight = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M60FrontSight(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M60FrontSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.7f, (float)3.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M60FrontSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M60FrontSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M60FrontSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M38FrontSight = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new FALIron(), "gun.png").withModel(new AKMiron2(), "gun.png").withModel(new AK47iron(), "gun.png").withRequiredAttachments(M38HandGuard, LVOAVHandGuard, Mk18HandGuard, StonerHANDGUARD, AR57Handguard).withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK47iron) {
                GL11.glTranslatef((float)-0.6f, (float)-1.5f, (float)1.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.4f, (double)1.4f, (double)1.4f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK47iron) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK47iron) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M38FrontSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HK416FrontSight = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new G95_upright_frontsights(), "gun.png").withRequiredAttachments(M38HandGuard, LVOAVHandGuard, Mk18HandGuard, StonerHANDGUARD, AR57Handguard, M16A4HandGuard, M4CarbineHandGuard, ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuard, ACRWEMSKHandGuardTan, ACRPrecisionHandGuard, ACRPrecisionHandGuardTan, ACRSBRHandGuard, ACRSBRHandGuardTan, ACRPolymerHandGuard, ACRPolymerHandGuardTan, ACRSquareDropHandguard, ACRSquareDropHandguardTan, HoneyBadgerHandguard, HoneyBadgerMatrixArmsHandguard, Placeholder).withInventoryModelPositioning((model, s) -> {
            if (model instanceof G95_upright_frontsights) {
                GL11.glTranslatef((float)-0.6f, (float)-1.2f, (float)0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G95_upright_frontsights) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G95_upright_frontsights) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HK416FrontSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MBUSFrontSight = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MBUSFrontSight(), "gun.png").withRequiredAttachments(M38HandGuard, LVOAVHandGuard, Mk18HandGuard, StonerHANDGUARD, AR57Handguard, M16A4HandGuard, M4CarbineHandGuard, ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuard, ACRWEMSKHandGuardTan, ACRPrecisionHandGuard, ACRPrecisionHandGuardTan, ACRSBRHandGuard, ACRSBRHandGuardTan, ACRPolymerHandGuard, ACRPolymerHandGuardTan, ACRSquareDropHandguard, ACRSquareDropHandguardTan, HoneyBadgerHandguard, HoneyBadgerMatrixArmsHandguard, VectorHandguard, Vector556Handguard, APC9Placeholder, ARX160Chassis, ARX160ChassisOlive, ARX160ChassisTan).withInventoryModelPositioning((model, s) -> {
            if (model instanceof MBUSFrontSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.9f, (float)0.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MBUSFrontSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MBUSFrontSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MBUSFrontSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        G36KScope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.3f, 0.1f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)0.71f, (float)0.71f, (float)0.71f);
            GL11.glTranslatef((float)-0.29f, (float)-2.08f, (float)0.26f);
        }).withCategory(AttachmentCategory.SCOPE).withCrosshair("LP").withModel(new G36KScope(), "gun.png").withModel(new G36KReticle(), "black.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof PSO1) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof PSO1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof PSO12) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof PSO1) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof PSO1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof PSO12) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof PSO1) {
                GL11.glTranslatef((float)-0.6f, (float)-0.3f, (float)0.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof PSO1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof PSO12) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof PSO1) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof PSO1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof PSO12) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("G36KScope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        LeupoldScope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.06f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glTranslatef((float)-0.085f, (float)0.33f, (float)1.75f);
        }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, G2ContenderBarrelLong).withCrosshair("LP").withModel(new Leupold(), "gun.png").withModel(new JPUreticle(), "black.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Leupold) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Leupold) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Leupold) {
                GL11.glTranslatef((float)-0.6f, (float)-0.3f, (float)0.9f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Leupold) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Leupold").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        PSO1 = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.06f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.05f, (float)1.05f, (float)1.05f);
            GL11.glTranslatef((float)-0.3165f, (float)0.17f, (float)1.2f);
        }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("LP").withModel(new PSO1(), "gun.png").withModel(new PSO12(), "gun.png").withModel(new PSO1reticle(), "black.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof PSO1) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof PSO1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof PSO12) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof PSO1) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof PSO1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof PSO12) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof PSO1) {
                GL11.glTranslatef((float)-0.6f, (float)-0.3f, (float)0.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof PSO1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof PSO12) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof PSO1) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof PSO1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof PSO12) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("PSO1").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        OKP7 = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new OKP7(), "gun.png").withModel(new OKP7reticle(), "green.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof OKP7) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof OKP7reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof OKP7) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            } else if (model instanceof OKP7reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof OKP7) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)1.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof OKP7reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof OKP7) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof OKP7reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("okp7").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Reflex = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new Reflex(), "Reflex.png").withModel(new Reflex2(), "Reflex2.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Reflex) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Reflex) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Reflex) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)1.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Reflex) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Reflex").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        BijiaReflex = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new BijiaReflex(), "gun.png").withModel(new Reflex2(), "green.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, FABDefenseMount, Placeholder, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, DesertEagleSlide, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof BijiaReflex) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof BijiaReflex) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof BijiaReflex) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)0.95f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof BijiaReflex) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("BijiaReflex").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MicroReflex = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new MicroReflexSight(), "gun.png").withModel(new SightMount(), "gun.png").withModel(new Reflex2(), "Reflex2.png").withPostRender(new LaserBeamRenderer((p, s) -> GL11.glTranslatef((float)-0.0f, (float)2.3f, (float)1.8f))).withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, FABDefenseMount, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MicroReflexSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MicroReflexSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof MicroReflexSight) {
                GL11.glTranslatef((float)-0.6f, (float)-1.9f, (float)0.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof MicroReflexSight) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MicroReflex").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ACOG = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.17f, (float)1.17f, (float)1.17f);
            GL11.glTranslatef((float)0.087f, (float)0.42f, (float)0.56f);
        }).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ACOG(), "Acog.png").withModel(new AcogScope2(), "gun.png").withModel(new AcogReticle(), "acogreticle.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACOG) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)1.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof AcogReticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AcogScope2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ACOG) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof AcogReticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AcogScope2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof ACOG) {
                GL11.glTranslatef((float)-0.6f, (float)-0.7f, (float)0.9f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof AcogReticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AcogScope2) {
                GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
                GL11.glTranslatef((float)1.0f, (float)0.0f, (float)-1.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof ACOG) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof AcogReticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AcogScope2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Acog").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Specter = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)2.7f, (float)2.8f, (float)2.7f);
            GL11.glTranslatef((float)-0.06f, (float)0.28f, (float)0.56f);
        }).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new SpecterSight(), "SpecterSight.png").withModel(new Acog2(), "Acog2.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SpecterSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.35f, (double)0.35f, (double)0.35f);
            } else if (model instanceof Acog2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof SpecterSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.25, (double)0.25, (double)0.25);
            } else if (model instanceof Acog2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof SpecterSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)0.95f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof Acog2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof SpecterSight) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Acog2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Specter").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Holographic = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new Holographic2(), "Holographic2.png").withModel(new Holo2(), "Holo3.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Holographic2) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Holographic2) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Holographic2) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)0.7f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Holographic2) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Holographic2").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HolographicAlt = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new Holographic(), "Holographic.png").withModel(new Holo2(), "Holo3.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Holographic) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Holographic) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Holographic) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)0.4f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Holographic) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HolographicAlt").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        EotechHybrid2 = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.2f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.35f, (float)1.35f, (float)1.35f);
            GL11.glTranslatef((float)-0.207f, (float)0.26f, (float)1.4f);
        }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new EotechHybrid2(), "gun.png").withModel(new EotechScopeRing(), "gun.png").withModel(new Holo2(), "Holo3.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof EotechHybrid2) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof EotechScopeRing) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof EotechHybrid2) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof EotechScopeRing) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof EotechHybrid2) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)1.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof EotechScopeRing) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof EotechHybrid2) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof EotechScopeRing) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("EotechHybrid2").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        VortexRedux = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new VortexSight(), "vortexsight.png").withModel(new Holo2(), "Holo3.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof VortexSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof VortexSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof VortexSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.8f, (float)1.6f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof VortexSight) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Holo2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("VortexSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MicroT1 = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new MicroT1(), "gun.png").withModel(new Reflex2(), "Reflex2.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MicroT1) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MicroT1) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof MicroT1) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof MicroT1) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MicroT1").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AimpointCompM5 = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new AimpointCompM5(), "aimpointcompm5.png").withModel(new Reflex2(), "Reflex2.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AimpointCompM5) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AimpointCompM5) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof AimpointCompM5) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof AimpointCompM5) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AimpointCompM5").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        RMR = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new RMRsight(), "RMRsight.png").withModel(new Reflex2(), "Reflex2.png").withRequiredAttachments(FABDefenseMount, VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Placeholder, Kar98Krail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, DesertEagleSlide, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof RMRsight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof RMRsight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof RMRsight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.9f, (float)0.6f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof RMRsight) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("RMRsight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Kobra = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Kobra(), "gunmetaltexture.png").withModel(new Reflex2(), "Reflex2.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withRenderablePart().withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Kobra) {
                GL11.glTranslatef((float)0.4f, (float)-0.8f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Kobra) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Kobra) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Kobra) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Kobra").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        KobraGen3 = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new KobraGen3(), "gun.png").withModel(new Reflex2(), "Reflex2.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withRenderablePart().withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KobraGen3) {
                GL11.glTranslatef((float)0.4f, (float)-0.8f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KobraGen3) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof KobraGen3) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.1f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof KobraGen3) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof Reflex2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("KobraGen3").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HP = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.02f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.65f, (float)1.65f, (float)1.65f);
            GL11.glTranslatef((float)0.0285f, (float)0.492f, (float)0.7f);
        }).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP").withModel(new HP(), "gun.png").withModel(new JPUreticle(), "black.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, Kar98Krail, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HP) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof HP) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof HP) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof HP) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HPScope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        LeupoldRailScope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.06f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)2.3f, (float)2.3f, (float)2.3f);
            GL11.glTranslatef((float)-0.085f, (float)0.33f, (float)1.75f);
        }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, Kar98Krail, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail, SSG08Chassis, SA58DustCover, M16A1ScopeMount, G2ContenderBarrelLong).withCrosshair("LP").withRenderablePart().withModel(new LeupoldRail(), "gun.png").withModel(new JPUreticle(), "black.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof LeupoldRail) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof LeupoldRail) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof LeupoldRail) {
                GL11.glTranslatef((float)-0.6f, (float)-0.3f, (float)0.9f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof LeupoldRail) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("LeupoldRailScope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AX50Scope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.02f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.85f, (float)1.85f, (float)1.85f);
            GL11.glTranslatef((float)-0.0765f, (float)0.565f, (float)0.7f);
        }).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP").withModel(new AX50Scope(), "gun.png").withModel(new JPUreticle(), "black.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AX50Scope) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.3f, (double)0.3f, (double)0.3f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AX50Scope) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.2f, (double)0.2f, (double)0.2f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof AX50Scope) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.45f, (double)0.45f, (double)0.45f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof AX50Scope) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AX50Scope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        NightRaider = new ItemScope.Builder().withNightVision().withOpticalZoom().withZoomRange(0.22f, 0.02f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.6f, (float)1.6f, (float)1.6f);
            GL11.glTranslatef((float)-0.045f, (float)0.495f, (float)1.551f);
        }).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP").withModel(new NightRaiderScope(), "gun.png").withModel(new JPUreticle(), "black.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover, EF88Handguard, VectorHandguard, Vector556Handguard, M1CarbineScoutHandguard, M14Rail, SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof NightRaiderScope) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof NightRaiderScope) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof NightRaiderScope) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)1.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof NightRaiderScope) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("NightRaiderScope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M2A1sight = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.2f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.54f, (float)1.54f, (float)1.54f);
            GL11.glTranslatef((float)-0.09f, (float)-0.265f, (float)-0.7f);
        }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new M2A1(), "gun.png").withModel(new M2A1reticle(), "red.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M2A1) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof M2A1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M2A1) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof M2A1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof M2A1) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)1.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else if (model instanceof M2A1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof M2A1) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof M2A1reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("m2a1_sight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        F2000Scope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.02f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)0.54f, (float)0.56f, (float)0.55f);
            GL11.glTranslatef((float)-0.125f, (float)-0.923f, (float)1.621f);
        }).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP").withModel(new F2000Scope(), "gun.png").withModel(new F2000Scope2(), "gun.png").withModel(new F2000Reticle(), "black.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof F2000Scope) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof F2000Reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof F2000Scope2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof F2000Scope) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof F2000Reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof F2000Scope2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof F2000Scope) {
                GL11.glTranslatef((float)-0.6f, (float)-0.0f, (float)0.45f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.85f, (double)0.85f, (double)0.85f);
            } else if (model instanceof F2000Reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof F2000Scope2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof F2000Scope) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof F2000Reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof F2000Scope2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("F2000Scope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M202scope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.02f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.7f, (float)1.7f, (float)1.7f);
            GL11.glTranslatef((float)0.375f, (float)0.185f, (float)0.34f);
        }).withCrosshair("HP").withModel(new JPUreticle(), "black.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)-0.6f, (float)-0.6f, (float)0.6f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("M202scope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AUGscope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.02f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.05f, (float)1.05f, (float)1.05f);
            GL11.glTranslatef((float)-0.23f, (float)-0.77f, (float)0.65f);
        }).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP").withModel(new AUGScope_scope(), "gun.png").withModel(new JPUreticle(), "black.png").withModel(new AUGScope(), "gun.png").withRequiredAttachments(AUGA1handguard).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGScope_scope) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AUGScope) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGScope_scope) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AUGScope) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof AUGScope_scope) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)1.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AUGScope) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof AUGScope_scope) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof JPUreticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AUGScope) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AUGscope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        OSIPRMiniScope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.2f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.35f, (float)1.35f, (float)1.35f);
            GL11.glTranslatef((float)-0.385f, (float)1.215f, (float)0.2f);
        }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new OSIPRminiscope(), "gun.png").withModel(new FALIron(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRminiscope) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof FALIron) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRminiscope) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof FALIron) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRminiscope) {
                GL11.glTranslatef((float)-0.6f, (float)-0.9f, (float)0.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else if (model instanceof FALIron) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRminiscope) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof FALIron) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("OSIPRMiniScope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        OSIPRSight = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new OSIPRSight(), "OSIPRMount.png").withModel(new OSIPRscopereticle(), "OSIPRscopereticle.png").withRequiredAttachments(OSIPRMount).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.2f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof OSIPRscopereticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof OSIPRscopereticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)-0.5f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            } else if (model instanceof OSIPRscopereticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRSight) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof OSIPRscopereticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("OSIPRSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MA5Dcover = new ItemScope.Builder().withNightVision().withOpticalZoom().withZoomRange(0.22f, 0.02f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)0.59f, (float)0.59f, (float)0.55f);
            GL11.glTranslatef((float)-0.123f, (float)-0.83f, (float)1.62f);
        }).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP").withModel(new MA5Dcover(), "MA5D.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MA5Dcover) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MA5Dcover) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof MA5Dcover) {
                GL11.glTranslatef((float)-0.6f, (float)1.4f, (float)-2.0f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.15f, (double)1.15f, (double)1.15f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof MA5Dcover) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("MA5Dcover").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        BR55Scope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)2.7f, (float)2.7f, (float)2.7f);
            GL11.glTranslatef((float)-0.046f, (float)0.547f, (float)0.07f);
        }).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new BR55scope(), "BR55scope.png").withModel(new BR55scopereticle(), "BR55scopereticle.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof BR55scope) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof BR55scopereticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof BR55scope) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof BR55scopereticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof BR55scope) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)0.15f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
            } else if (model instanceof BR55scopereticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof BR55scope) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof BR55scopereticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("BR55scope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        DMRScope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f).withViewfinderPositioning((p, s) -> {
            GL11.glScalef((float)1.7f, (float)1.7f, (float)1.7f);
            GL11.glTranslatef((float)-0.05f, (float)0.56f, (float)0.1f);
        }).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new DMRscope(), "DMRscope.png").withModel(new DMRscopeReticle(), "black.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DMRscope) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof DMRscopeReticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DMRscope) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof DMRscopeReticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof DMRscope) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)0.3f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.95f, (double)0.95f, (double)0.95f);
            } else if (model instanceof DMRscopeReticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof DMRscope) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof DMRscopeReticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("DMRscope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SRS99Scope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f).withViewfinderPositioning((p, s) -> {
            float scale = 3.0f;
            GL11.glScalef((float)scale, (float)(scale / CompatibilityProvider.compatibility.getAspectRatio(ModernWarfareMod.MOD_CONTEXT)), (float)scale);
            GL11.glTranslatef((float)-0.02f, (float)0.65f, (float)0.26f);
            GL11.glScalef((float)1.8f, (float)1.2f, (float)1.0f);
        }).withViewfinderSize(650, 250).withRenderablePart().withModel(new SRS99Scope(), "srs99scope.png").withModel(new SRS99Reticle(), "SRS99Reticle.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DMRscope) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else if (model instanceof SRS99Reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DMRscope) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof SRS99Reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof DMRscope) {
                GL11.glTranslatef((float)-0.6f, (float)-0.5f, (float)0.05f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.65f, (double)0.65f, (double)0.65f);
            } else if (model instanceof SRS99Reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof DMRscope) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof SRS99Reticle) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("SRS99Scope").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer556x45 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor556x45(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x45) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x45) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x45) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x45) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer556x45").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer545x39 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor556x39(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer545x39").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer762x39 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor762x39(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor762x39) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor762x39) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor762x39) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor762x39) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer762x39").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M32Barrel = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("M32Barrel").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870Pump = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new Remington870Pump(), "remington870.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Pump) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Pump) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Pump) {
                GL11.glTranslatef((float)0.6f, (float)0.6f, (float)-2.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Pump) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Remington870Pump").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870MagpulPump = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new Remington870MagpulPump(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870MagpulPump) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870MagpulPump) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870MagpulPump) {
                GL11.glTranslatef((float)0.6f, (float)0.6f, (float)-2.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870MagpulPump) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Remington870MagpulPump").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870PoliceMagnumPump = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new Remington870PoliceMagnumPump(), "remington870.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumPump) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumPump) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumPump) {
                GL11.glTranslatef((float)0.6f, (float)0.6f, (float)-2.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumPump) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Remington870PoliceMagnumPump").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870FABDefensePump = new AttachmentBuilder().withCategory(AttachmentCategory.GUARD).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRenderablePart().withModel(new Remington870FABDefensePump(), "gun.png").withModel(new AKRail(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870FABDefensePump) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof AKRail) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870FABDefensePump) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof AKRail) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870FABDefensePump) {
                GL11.glTranslatef((float)0.6f, (float)0.6f, (float)-2.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.75, (double)0.75, (double)0.75);
            } else if (model instanceof AKRail) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870FABDefensePump) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof AKRail) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Remington870FABDefensePump").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Remington870Stock(), "remington870.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Stock) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Stock) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Stock) {
                GL11.glTranslatef((float)0.6f, (float)0.5f, (float)1.0f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Stock) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Remington870Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870PoliceMagnumStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Remington870PoliceMagnumStock(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)0.6f, (float)0.2f, (float)0.2f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Remington870PoliceMagnumStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870MilspecStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Remington870PoliceMagnumStock(), "gun.png").withModel(new MilSpecStock(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof MilSpecStock) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof MilSpecStock) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)0.6f, (float)0.3f, (float)0.7f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else if (model instanceof MilSpecStock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)1.0f);
                GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof MilSpecStock) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Remington870MilSpecStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870HK416Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Remington870PoliceMagnumStock(), "gun.png").withModel(new HK416Stock(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof HK416Stock) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof HK416Stock) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)0.6f, (float)0.3f, (float)0.7f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            } else if (model instanceof HK416Stock) {
                GL11.glTranslatef((float)-0.6f, (float)-0.1f, (float)1.0f);
                GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.9f, (double)0.9f, (double)0.9f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumStock) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof HK416Stock) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Remington870HK416StockStock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870SawedGrip = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Remington870SawedGrip(), "remington870.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870SawedGrip) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870SawedGrip) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870SawedGrip) {
                GL11.glTranslatef((float)0.6f, (float)0.5f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870SawedGrip) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Remington870SawedGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870Barrel = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Remington870Barrel(), "gun.png").withModel(new R870part(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Barrel) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof R870part) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Barrel) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof R870part) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Barrel) {
                GL11.glTranslatef((float)0.6f, (float)0.8f, (float)-2.8f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
            } else if (model instanceof R870part) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870Barrel) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof R870part) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Remington870Barrel").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870PoliceMagnumBarrel = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Remington870PoliceMagnumBarrel(), "gun.png").withModel(new M9A1frontsight(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumBarrel) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof M9A1frontsight) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumBarrel) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof M9A1frontsight) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumBarrel) {
                GL11.glTranslatef((float)0.6f, (float)0.8f, (float)-2.8f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.55f, (double)0.55f, (double)0.55f);
            } else if (model instanceof M9A1frontsight) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870PoliceMagnumBarrel) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof M9A1frontsight) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Remington870PoliceMagnumBarrel").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Remington870SawedOffBarrel = new AttachmentBuilder().withCategory(AttachmentCategory.RECEIVER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Remington870SawedBarrel(), "gun.png").withModel(new M9A1frontsight(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870SawedBarrel) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof M9A1frontsight) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870SawedBarrel) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else if (model instanceof M9A1frontsight) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870SawedBarrel) {
                GL11.glTranslatef((float)0.6f, (float)0.8f, (float)-2.5f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.66f, (double)0.66f, (double)0.66f);
            } else if (model instanceof M9A1frontsight) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Remington870SawedBarrel) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            } else if (model instanceof M9A1frontsight) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Remington870SawedBarrel").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        RPKBarrel = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new RPKbarrel(), "gun.png").withModel(new AKiron3(), "gun").withModel(new AKMiron2(), "gun").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof RPKbarrel) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof RPKbarrel) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof RPKbarrel) {
                GL11.glTranslatef((float)0.6f, (float)1.0f, (float)-4.5f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            } else if (model instanceof AKiron3) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            } else if (model instanceof AKMiron2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof RPKbarrel) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("RPKbarrel").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AKIron = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AKiron3(), "gun").withModel(new AKMiron2(), "gun").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKiron3) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AKiron3) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof AKiron3) {
                GL11.glTranslatef((float)0.6f, (float)0.5f, (float)-0.5f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            } else if (model instanceof AKMiron2) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof AKiron3) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("AKIron").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SilencerPBS = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRequiredAttachments(MakarovPBBody).withModel(new MakarovPBSSilencer(), "MakarovPBSSilencer.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPBSSilencer) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPBSSilencer) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPBSSilencer) {
                GL11.glTranslatef((float)0.6f, (float)1.4f, (float)-3.8f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof MakarovPBSSilencer) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("SilencerPBS").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer9mm = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRequiredAttachments(M9A1Body, ScorpionHandguardShort, ScorpionHandguardLong, Glock19Body, Glock19XBody, Glock19RazorbackBody, Glock18CBody, P226Slide, APC9Placeholder).withModel(new Suppressor(), "GunmetalTexture.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer9mm").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SilencerMP5 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor(), "gun.png").withRequiredAttachments(MP5SDHandGuard).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("SilencerMP5").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer9x39mm = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor(), "GunmetalTexture.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer9x39mm").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer45ACP = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRequiredAttachments(VectorHandguard, M1911Body).withModel(new Suppressor45ACP(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer45ACP").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SilencerEABH = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor45ACP(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("silencer_eabh").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer762x54 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer762x54").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer762x51 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor762x51(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor762x51) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor762x51) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor762x51) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor762x51) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer762x51").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer50BMG = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor(), "GunmetalTexture.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer50BMG").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer556x39 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor556x39(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer556x39").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AKMIron = new AttachmentBuilder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AKMiron1(), "gun.png").withModel(new AKMiron2(), "gun.png").withModel(new AK47iron(), "gun.png").withModel(new M4Iron1(), "gun.png").withModel(new M4Iron2(), "gun.png").withModel(new P90iron(), "gun.png").withModel(new G36CIron1(), "gun.png").withModel(new G36CIron2(), "gun.png").withModel(new ScarIron1(), "gun.png").withModel(new ScarIron2(), "gun.png").withModel(new FALIron(), "gun.png").withModel(new M14Iron(), "gun.png").withModel(new MP5Iron(), "gun.png").withModel(new MP5Iron(), "gun.png").withModel(new M27rearsight(), "gun.png").withModel(new MBUSiron(), "gun.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, EF88Handguard, VectorHandguard, Vector556Handguard, Origin12Grip, HKS20Grip).withInventoryModelPositioning((model, s) -> {
            if (model instanceof M27rearsight) {
                GL11.glTranslatef((float)-0.6f, (float)-1.0f, (float)0.5f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M27rearsight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M27rearsight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AKMIron").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        TritiumRearSights = new AttachmentBuilder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new TritiumRearSights(), "gun.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, EF88Handguard, VectorHandguard, Vector556Handguard, Origin12Grip, HKS20Grip).withInventoryModelPositioning((model, s) -> {
            if (model instanceof TritiumRearSights) {
                GL11.glTranslatef((float)-0.6f, (float)-0.9f, (float)0.45f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof TritiumRearSights) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof TritiumRearSights) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("TritiumRearSights").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        MBUSRearSights = new AttachmentBuilder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new MBUSRearSight(), "gun.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, EF88Handguard, VectorHandguard, Vector556Handguard, Origin12Grip, HKS20Grip, ARX160Chassis, ARX160ChassisOlive, ARX160ChassisTan).withInventoryModelPositioning((model, s) -> {
            if (model instanceof MBUSRearSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.9f, (float)0.45f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MBUSRearSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof MBUSRearSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("MBUSRearSights").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HK416RearSights = new AttachmentBuilder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new G95_upright_rearsights(), "gun.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, VLTORReceiver, AR57Receiver, EF88Handguard, VectorHandguard, Vector556Handguard, Origin12Grip, HKS20Grip).withInventoryModelPositioning((model, s) -> {
            if (model instanceof G95_upright_rearsights) {
                GL11.glTranslatef((float)-0.6f, (float)-0.9f, (float)0.45f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G95_upright_rearsights) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof G95_upright_rearsights) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("HK416RearSights").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        FNFALRearSights = new AttachmentBuilder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new FNFALRearSight(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof FNFALRearSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.7f, (float)0.65f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALRearSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof FNFALRearSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("FNFALRearSights").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M16A1RearSights = new AttachmentBuilder().withCategory(AttachmentCategory.EXTRA).withModel(new M16A1RearSight(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof M16A1RearSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.7f, (float)0.65f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16A1RearSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M16A1RearSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("M16A1RearSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        K2C1RearSights = new AttachmentBuilder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new K2C1RearSight(), "gun.png").withModel(new ScarIron2(), "gun.png").withModel(new FALIron(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof K2C1RearSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.7f, (float)0.65f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof K2C1RearSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof K2C1RearSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("K2C1RearSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ScorpionRearSight = new AttachmentBuilder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ScorpionRearSight(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ScorpionRearSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.7f, (float)0.65f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScorpionRearSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScorpionRearSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ScorpionRearSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        ScorpionFrontSight = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new ScorpionFrontSight(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof ScorpionFrontSight) {
                GL11.glTranslatef((float)-0.6f, (float)-0.7f, (float)0.65f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScorpionFrontSight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof ScorpionFrontSight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("ScorpionFrontSight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Kar98Ksight = new AttachmentBuilder().withCategory(AttachmentCategory.RAILING).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK47iron(), "gun.png").withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK47iron) {
                GL11.glTranslatef((float)-0.6f, (float)-1.6f, (float)0.95f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.8f, (double)1.8f, (double)1.8f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK47iron) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK47iron) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("Kar98Ksight").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK15ironsight = new AttachmentBuilder().withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new KA_AK12_Ironsight(), "gun.png").withModel(new AKMiron2(), "gun.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, RPKDustCover).withInventoryModelPositioning((model, s) -> {
            if (model instanceof KA_AK12_Ironsight) {
                GL11.glTranslatef((float)-0.6f, (float)-1.0f, (float)0.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KA_AK12_Ironsight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof KA_AK12_Ironsight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK15ironsight").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AK12ironsight = new AttachmentBuilder().withCategory(AttachmentCategory.FRONTSIGHT).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AK15ironsight(), "gun.png").withModel(new AKMiron2(), "gun.png").withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, RPKDustCover).withInventoryModelPositioning((model, s) -> {
            if (model instanceof AK15ironsight) {
                GL11.glTranslatef((float)-0.6f, (float)-1.0f, (float)0.7f);
                GL11.glRotatef((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-190.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            } else {
                GL11.glScalef((float)0.0f, (float)0.0f, (float)0.0f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK15ironsight) {
                GL11.glTranslatef((float)0.1f, (float)-0.8f, (float)0.4f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AK15ironsight) {
                GL11.glTranslatef((float)-0.8f, (float)-0.5f, (float)0.8f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            } else {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withName("AK12ironsight").withRenderablePart().withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        SilencerMP7 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("SilencerMP7").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer357 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor(), "GunmetalTexture.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer357").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer57x38 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer57x38").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer12Gauge = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor45ACP(), "GunmetalTexture.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor45ACP) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer12Gauge").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer300AACBlackout = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor300AACBlackout(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor300AACBlackout) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor300AACBlackout) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor300AACBlackout) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor300AACBlackout) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer300AACBlackout").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        HoneyBadgerSilencer = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withModel(new AACHoneyBadgerSilencer(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerSilencer) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerSilencer) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof AACHoneyBadgerSilencer) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor300AACBlackout) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("HoneyBadgerSilencer").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Silencer65x39 = new AttachmentBuilder().withCategory(AttachmentCategory.SILENCER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Suppressor556x39(), "gun.png").withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)0.6f, (float)0.1f, (float)0.3f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Suppressor556x39) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withName("Silencer65x39").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Laser = new AttachmentBuilder().withCategory(AttachmentCategory.LASER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withRequiredAttachments(M4CarbineHandGuard, M38HandGuard, UTGTriRailHandGuard, PistolPlaceholder, FABDefenseMount, LaserPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard, StonerHANDGUARD, M9A1Body, SamuraiEdgeAWBody, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack, HoneyBadgerMatrixArmsHandguard, UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis, ARX160ChassisOlive, ARX160ChassisTan).withModel(new Laser(), "gun.png").withPostRender(new LaserBeamRenderer((p, s) -> GL11.glTranslatef((float)-0.2f, (float)1.4f, (float)1.8f))).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Laser) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof Laser)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Laser) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Laser) {
                GL11.glTranslatef((float)0.6f, (float)-0.3f, (float)0.5f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.8f, (double)1.8f, (double)1.8f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Laser) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withRenderablePart().withName("Laser").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Laser2 = new AttachmentBuilder().withCategory(AttachmentCategory.LASER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Laser3(), "laser2.png").withRequiredAttachments(M4CarbineHandGuard, M38HandGuard, UTGTriRailHandGuard, PistolPlaceholder, LaserPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard, StonerHANDGUARD, AR57Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack, HoneyBadgerMatrixArmsHandguard, AR10SuperSASSHandguard, UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis, ARX160ChassisOlive, ARX160ChassisTan).withPostRender(new LaserBeamRenderer((p, s) -> GL11.glTranslatef((float)-0.2f, (float)1.3f, (float)1.8f))).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Laser3) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Laser3) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Laser3) {
                GL11.glTranslatef((float)0.6f, (float)-0.3f, (float)0.4f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.8f, (double)1.8f, (double)1.8f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Laser3) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withRenderablePart().withName("Laser2").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        DanWessonLaser = new AttachmentBuilder().withCategory(AttachmentCategory.LASER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new DanWessonLaser(), "DanWessonLaser.png").withPostRender(new LaserBeamRenderer((p, s) -> GL11.glTranslatef((float)-0.2f, (float)1.4f, (float)1.8f))).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DanWessonLaser) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof DanWessonLaser)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof DanWessonLaser) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof DanWessonLaser) {
                GL11.glTranslatef((float)0.6f, (float)-0.0f, (float)0.2f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof DanWessonLaser) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withRenderablePart().withName("DanWessonLaser").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        OSIPRLaser = new AttachmentBuilder().withCategory(AttachmentCategory.LASER).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new OSIPRLaser(), "OSIPRMount.png").withRequiredAttachments(OSIPRMount).withPostRender(new LaserBeamRenderer((p, s) -> GL11.glTranslatef((float)-0.5f, (float)0.95f, (float)0.5f))).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRLaser) {
                GL11.glTranslatef((float)0.5f, (float)-1.3f, (float)-0.1f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withFirstPersonModelPositioning((model, itemStack) -> {
            if (!(model instanceof OSIPRLaser)) {
                GL11.glScaled((double)0.0, (double)0.0, (double)0.0);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRLaser) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRLaser) {
                GL11.glTranslatef((float)0.6f, (float)1.3f, (float)-4.6f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)3.0, (double)3.0, (double)3.0);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof OSIPRLaser) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.4f, (double)0.4f, (double)0.4f);
            }
        }).withRenderablePart().withName("OSIPRLaser").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M1928Grip = new AttachmentBuilder().withCategory(AttachmentCategory.GRIP).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M1928Grip(), "m1a1thompson.png").withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.6f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1928Grip) {
                GL11.glTranslatef((float)0.7f, (float)-1.2f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1928Grip) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof M1928Grip) {
                GL11.glTranslatef((float)0.6f, (float)0.5f, (float)-3.2f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof M1928Grip) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withName("M1928Grip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        M1A1Grip = new AttachmentBuilder().withCategory(AttachmentCategory.GRIP).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M1A1Grip(), "m1a1thompson.png").withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 1.0f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1A1Grip) {
                GL11.glTranslatef((float)0.7f, (float)-1.2f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof M1A1Grip) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof M1A1Grip) {
                GL11.glTranslatef((float)0.6f, (float)1.1f, (float)-3.6f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.1f, (double)1.1f, (double)1.1f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof M1A1Grip) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withName("M1A1Grip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Grip2 = new AttachmentBuilder().withCategory(AttachmentCategory.GRIP).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Grip2(), "gun.png").withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard, M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard, GripPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD, VectorHandguard, Vector556Handguard, Remington870FABDefensePump, Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuard, ACRWEMSKHandGuardTan, HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard, UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis, ARX160ChassisOlive, ARX160ChassisTan).withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.6f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Grip2) {
                GL11.glTranslatef((float)0.7f, (float)-1.2f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Grip2) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Grip2) {
                GL11.glTranslatef((float)0.6f, (float)0.3f, (float)-0.5f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.3f, (double)1.3f, (double)1.3f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Grip2) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withName("Grip2").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        JunoGrip = new AttachmentBuilder().withCategory(AttachmentCategory.GRIP).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new JunoGrip(), "gun.png").withRequiredAttachments(MLOKExtendedHandguard, M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, Mk18HandGuard, AR57Handguard, RPK16Handguard, M16A4HandGuard, HoneyBadgerMatrixArmsHandguard, AR10SuperSASSHandguard).withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.6f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof JunoGrip) {
                GL11.glTranslatef((float)0.7f, (float)-1.2f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof JunoGrip) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof JunoGrip) {
                GL11.glTranslatef((float)0.6f, (float)0.0f, (float)-0.1f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.8f, (double)0.8f, (double)0.8f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof JunoGrip) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withName("JunoGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        GlockStock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Glock18Cstock(), "gun.png").withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.4f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock18Cstock) {
                GL11.glTranslatef((float)0.7f, (float)-1.2f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Glock18Cstock) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Glock18Cstock) {
                GL11.glTranslatef((float)0.6f, (float)0.3f, (float)0.5f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Glock18Cstock) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withName("Glock18Cstock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        VP70Stock = new AttachmentBuilder().withCategory(AttachmentCategory.STOCK).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new VP70stock(), "gun.png").withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.6f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof VP70stock) {
                GL11.glTranslatef((float)0.7f, (float)-1.2f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof VP70stock) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof VP70stock) {
                GL11.glTranslatef((float)0.6f, (float)0.3f, (float)0.5f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof VP70stock) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withName("VP70Stock").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AngledGrip = new AttachmentBuilder().withCategory(AttachmentCategory.GRIP).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AngledGrip(), "gun.png").withRequiredAttachments(MLOKExtendedHandguard, M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, GripPlaceholder, UTGTriRailHandGuard, Mk18HandGuard, M60E4HandGuard, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD, VectorHandguard, Vector556Handguard, Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuard, ACRWEMSKHandGuardTan, HoneyBadgerMatrixArmsHandguard, FNFALPARAHandguard, M16A1PicatinnyRail, AR10SuperSASSHandguard, ARX160Chassis, ARX160ChassisOlive, ARX160ChassisTan).withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.6f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AngledGrip) {
                GL11.glTranslatef((float)0.7f, (float)-1.1f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AngledGrip) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof AngledGrip) {
                GL11.glTranslatef((float)0.6f, (float)0.8f, (float)-0.45f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.2f, (double)1.2f, (double)1.2f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof AngledGrip) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withRenderablePart().withName("AngledGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        StubbyGrip = new AttachmentBuilder().withRenderablePart().withCategory(AttachmentCategory.GRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new StubbyGrip(), "gun.png").withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard, M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard, GripPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD, VectorHandguard, Vector556Handguard, Remington870FABDefensePump, Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuard, ACRWEMSKHandGuardTan, HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard, UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis, ARX160ChassisOlive, ARX160ChassisTan).withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.6f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof StubbyGrip) {
                GL11.glTranslatef((float)0.7f, (float)-1.2f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof StubbyGrip) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof StubbyGrip) {
                GL11.glTranslatef((float)0.6f, (float)0.5f, (float)-0.5f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.6f, (double)1.6f, (double)1.6f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof StubbyGrip) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withName("StubbyGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        VGrip = new AttachmentBuilder().withCategory(AttachmentCategory.GRIP).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new VGrip(), "gun.png").withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard, M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard, GripPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD, VectorHandguard, Vector556Handguard, Remington870FABDefensePump, Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuard, ACRWEMSKHandGuardTan, HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard, UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis, ARX160ChassisOlive, ARX160ChassisTan).withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.6f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof VGrip) {
                GL11.glTranslatef((float)0.7f, (float)-1.1f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof VGrip) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof VGrip) {
                GL11.glTranslatef((float)0.6f, (float)0.3f, (float)-0.5f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.3f, (double)1.3f, (double)1.3f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof VGrip) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withRenderablePart().withName("VGrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        Bipod = new AttachmentBuilder().withCategory(AttachmentCategory.GRIP).withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new Bipod(), "bipod.png").withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard, M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard, GripPlaceholder, Mk18HandGuard, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD, StonerHANDGUARD, VectorHandguard, Vector556Handguard, M16A4HandGuard, ACRPrecisionHandGuard, ACRHandGuard, ACRPrecisionHandGuardTan, ACRHandGuardBlack, ACRWEMSKHandGuard, ACRWEMSKHandGuardTan, HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard, ARX160Chassis, ARX160ChassisOlive, ARX160ChassisTan).withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.4f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Bipod) {
                GL11.glTranslatef((float)0.7f, (float)-1.1f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof Bipod) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof Bipod) {
                GL11.glTranslatef((float)0.6f, (float)0.05f, (float)-0.85f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.7f, (double)0.7f, (double)0.7f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof Bipod) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withName("Bipod").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        AUGgrip = new AttachmentBuilder().withCategory(AttachmentCategory.GRIP).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AUGGrip(), "gun.png").withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.6f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGGrip) {
                GL11.glTranslatef((float)0.7f, (float)-1.1f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof AUGGrip) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof AUGGrip) {
                GL11.glTranslatef((float)0.6f, (float)0.6f, (float)-3.7f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.3f, (double)1.3f, (double)1.3f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof AUGGrip) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withRenderablePart().withName("AUGgrip").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        USPMatchCompensator = new AttachmentBuilder().withCategory(AttachmentCategory.GRIP).withRenderablePart().withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new USPMatchCompensator(), "gun.png").withApply((a, i) -> i.setRecoil(i.getWeapon().getRecoil() * 0.4f)).withFirstPersonModelPositioning((model, itemStack) -> {
            if (model instanceof USPMatchCompensator) {
                GL11.glTranslatef((float)0.7f, (float)-1.1f, (float)0.5f);
                GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof USPMatchCompensator) {
                GL11.glTranslatef((float)-0.7f, (float)-0.5f, (float)0.6f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof USPMatchCompensator) {
                GL11.glTranslatef((float)0.6f, (float)0.6f, (float)-3.7f);
                GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)1.3f, (double)1.3f, (double)1.3f);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof USPMatchCompensator) {
                GL11.glTranslatef((float)0.1f, (float)0.2f, (float)0.4f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScaled((double)0.6f, (double)0.6f, (double)0.6f);
            }
        }).withRenderablePart().withName("USPMatchCompensator").withModId("mw").withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
    }
}

