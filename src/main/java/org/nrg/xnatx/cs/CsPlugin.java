package org.nrg.xnatx.cs;

import lombok.extern.slf4j.Slf4j;
import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.om.CsCogscrdata;

@XnatPlugin(value = "xnatxCsDataPlugin", name = "XNATX CS Data Plugin",
            dataModels = @XnatDataModel(value = CsCogscrdata.SCHEMA_ELEMENT_NAME,
                                        code = "CRF",
                                        singular = "CRF",
                                        plural = "CRFs"))
@Slf4j
public class CsPlugin {
}