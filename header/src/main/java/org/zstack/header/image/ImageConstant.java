package org.zstack.header.image;

import org.zstack.header.configuration.PythonClass;

@PythonClass
public interface ImageConstant {
	public static enum ImageMediaType {
        RootVolumeTemplate,
        DataVolumeTemplate,
        ISO,
	}
	
	public static final String SERVICE_ID = "image";
	@PythonClass
	public static final String ZSTACK_IMAGE_TYPE = "zstack";

    public static final String ISO_FORMAT_STRING = "iso";
}
