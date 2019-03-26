/*
 * GENERATED FILE
 * Created on Tue Mar 26 15:13:30 CDT 2019
 *
 */
package org.apache.turbine.app.xnat.modules.screens;

import lombok.extern.slf4j.Slf4j;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.om.CsCogscrdata;

@Slf4j
public class XDATScreen_report_cs_cogScrData extends org.nrg.xdat.turbine.modules.screens.XDATScreen_report_cs_cogScrData {
    public void finalProcessing(final RunData data, final Context context) {
        log.debug("Now in the custom report screen class for {}", CsCogscrdata.SCHEMA_ELEMENT_NAME);
        super.finalProcessing(data, context);
    }
}
