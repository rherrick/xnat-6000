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

import java.util.Arrays;
import java.util.Collection;

@Slf4j
public class XDATScreen_edit_cs_cogScrData extends org.nrg.xdat.turbine.modules.screens.XDATScreen_edit_cs_cogScrData {
    public void finalProcessing(final RunData data, final Context context) {
        log.debug("Now in the custom report screen class for {}", CsCogscrdata.SCHEMA_ELEMENT_NAME);
        context.put("scoreValues", SCORE_VALUES);
        super.finalProcessing(data, context);
    }

    private static final Collection<Integer> SCORE_VALUES = Arrays.asList(1, 2, 3, 4, 5);
}
