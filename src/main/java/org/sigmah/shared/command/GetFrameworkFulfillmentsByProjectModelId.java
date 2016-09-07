package org.sigmah.shared.command;

/*
 * #%L
 * Sigmah
 * %%
 * Copyright (C) 2010 - 2016 URD
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import org.sigmah.client.util.ToStringBuilder;
import org.sigmah.shared.command.base.AbstractCommand;
import org.sigmah.shared.command.result.ListResult;
import org.sigmah.shared.dto.FrameworkFulfillmentDTO;

public class GetFrameworkFulfillmentsByProjectModelId extends AbstractCommand<ListResult<FrameworkFulfillmentDTO>> {
	private Integer projectModelId;

	public GetFrameworkFulfillmentsByProjectModelId() {
	}

	public GetFrameworkFulfillmentsByProjectModelId(Integer projectModelId) {
		this.projectModelId = projectModelId;
	}

	public Integer getProjectModelId() {
		return projectModelId;
	}

	@Override
	protected void appendToString(final ToStringBuilder builder) {
		builder.append("projectModelId", projectModelId);
	}
}