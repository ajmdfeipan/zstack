package org.zstack.header.vm;

import org.zstack.header.message.APIParam;
import org.zstack.header.message.APISyncCallMessage;

/**
 */
public class APIGetVmAttachableDataVolumeMsg extends APISyncCallMessage implements VmInstanceMessage{
    @APIParam(resourceType = VmInstanceVO.class)
    private String vmInstanceUuid;

    @Override
    public String getVmInstanceUuid() {
        return vmInstanceUuid;
    }

    public void setVmInstanceUuid(String vmInstanceUuid) {
        this.vmInstanceUuid = vmInstanceUuid;
    }
}
