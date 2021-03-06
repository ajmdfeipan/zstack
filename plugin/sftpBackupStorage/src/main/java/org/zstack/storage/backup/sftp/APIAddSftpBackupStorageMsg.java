package org.zstack.storage.backup.sftp;

import org.zstack.header.message.APIParam;
import org.zstack.header.storage.backup.APIAddBackupStorageMsg;
/**
 * @api
 * add a sftp backup storage
 *
 * @category sftp backup storage
 *
 * @since 0.1.0
 *
 * @cli
 *
 * @httpMsg
 * {
"org.zstack.storage.backup.sftp.APIAddSftpBackupStorageMsg": {
"hostname": "localhost",
"username": "root",
"password": "password",
"url": "nfs://test",
"name": "sftp",
"type": "SftpBackupStorage",
"session": {
"uuid": "6b01102e48ca4c8c9098f7684039e26a"
}
}
}
 *
 * @msg
 * {
"org.zstack.storage.backup.sftp.APIAddSftpBackupStorageMsg": {
"hostname": "localhost",
"username": "root",
"password": "password",
"url": "nfs://test",
"name": "sftp",
"type": "SftpBackupStorage",
"session": {
"uuid": "6b01102e48ca4c8c9098f7684039e26a"
},
"timeout": 1800000,
"id": "4f1fb24ae2db443f9ec486b0db84b899",
"serviceId": "api.portal"
}
}
 *
 * @result
 *
 * see :ref:`APIAddBackupStorageEvent`
 */
public class APIAddSftpBackupStorageMsg extends APIAddBackupStorageMsg {
    @APIParam(maxLength = 255)
    private String hostname;
    @APIParam(maxLength = 255)
    private String username;
    @APIParam(maxLength = 255)
    private String password;

    @Override
    public String getType() {
        return SftpBackupStorageConstant.SFTP_BACKUP_STORAGE_TYPE;
    }

    public String getHostname() {
        return hostname;
    }
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
