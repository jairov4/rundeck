/*
 * Copyright 2018 Rundeck, Inc. (http://rundeck.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtolabs.rundeck.server.plugins.services;

import com.dtolabs.rundeck.core.plugins.BasePluggableProviderService;
import com.dtolabs.rundeck.core.plugins.ServiceProviderLoader;
import com.dtolabs.rundeck.plugins.ServiceNameConstants;
import com.dtolabs.rundeck.plugins.file.FileUploadPlugin;

public class FileUploadProviderService extends BasePluggableProviderService<FileUploadPlugin> {
    public static final String                SERVICE_NAME = ServiceNameConstants.FileUpload;
    private             ServiceProviderLoader pluginManager;

    public FileUploadProviderService(final ServiceProviderLoader pluginManager) {
        super(SERVICE_NAME, FileUploadPlugin.class);
        this.pluginManager = pluginManager;
    }

    @Override
    public ServiceProviderLoader getPluginManager() {
        return pluginManager;
    }

}
