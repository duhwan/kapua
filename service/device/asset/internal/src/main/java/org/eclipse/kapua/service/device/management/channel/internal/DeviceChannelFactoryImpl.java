/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.kapua.service.device.management.channel.internal;

import org.eclipse.kapua.locator.KapuaProvider;
import org.eclipse.kapua.service.device.management.channel.DeviceChannel;
import org.eclipse.kapua.service.device.management.channel.DeviceChannelFactory;
import org.eclipse.kapua.service.device.management.channel.DeviceChannels;

/**
 * Device channel entity service factory implementation.
 *
 * @since 1.0
 *
 */
@KapuaProvider
public class DeviceChannelFactoryImpl implements DeviceChannelFactory {

    @Override
    public DeviceChannels newChannelListResult() {
        return new DeviceChannelsImpl();
    }

    @Override
    public <T> DeviceChannel<T> newDeviceChannel() {
        return new DeviceChannelImpl<T>();
    }

}
