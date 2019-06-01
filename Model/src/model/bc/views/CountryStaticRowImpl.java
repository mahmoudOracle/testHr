package model.bc.views;

import model.shared.extensions.ExtViewRowImpl;

import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri May 24 13:15:13 AST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CountryStaticRowImpl extends ExtViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Id,
        CountryName,
        RegId,
        CustomertView,
        RegStatic,
        CcityStatic;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int COUNTRYNAME = AttributesEnum.CountryName.index();
    public static final int REGID = AttributesEnum.RegId.index();
    public static final int CUSTOMERTVIEW = AttributesEnum.CustomertView.index();
    public static final int REGSTATIC = AttributesEnum.RegStatic.index();
    public static final int CCITYSTATIC = AttributesEnum.CcityStatic.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CountryStaticRowImpl() {
    }
}

