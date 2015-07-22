package com.thejavatar.blog.mondriandsp;

import mondrian.olap.Util;
import mondrian.spi.impl.FilterDynamicSchemaProcessor;

import java.io.InputStream;

/**
 * Created by Lukasz Janicki (contact@thejavatar.com) on 22/07/2015.
 */
public class ChangeAgeDynamicSchemaProcessor extends FilterDynamicSchemaProcessor {

    @Override
    protected String filter(final String schemaUrl, final Util.PropertyList connectInfo, final InputStream stream)
            throws java.lang.Exception {
        String originalSchema = super.filter(schemaUrl, connectInfo, stream);
        String modifiedSchema = originalSchema.replace("%PLACE_HOLDER%","24");
        return modifiedSchema;
    }

}
