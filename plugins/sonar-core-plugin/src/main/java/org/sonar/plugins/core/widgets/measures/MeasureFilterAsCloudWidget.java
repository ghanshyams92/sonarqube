/*
 * SonarQube, open source software quality management tool.
 * Copyright (C) 2008-2014 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * SonarQube is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * SonarQube is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.core.widgets.measures;

import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.web.*;
import org.sonar.plugins.core.widgets.CoreWidget;
import org.sonar.plugins.core.widgets.WidgetConstants;

import static org.sonar.api.web.WidgetScope.GLOBAL;

@WidgetCategory({"Filters", "Global"})
@WidgetScope(GLOBAL)
@WidgetProperties({
  @WidgetProperty(key = "filter", type = WidgetPropertyType.FILTER, optional = false),
  @WidgetProperty(key = "chartTitle", type = WidgetPropertyType.STRING),
  @WidgetProperty(key = "sizeMetric", type = WidgetPropertyType.METRIC, defaultValue = CoreMetrics.COMPLEXITY_KEY, options = {WidgetConstants.FILTER_OUT_NEW_METRICS}),
  @WidgetProperty(key = "colorMetric", type = WidgetPropertyType.METRIC, defaultValue = CoreMetrics.COVERAGE_KEY,
    options = { WidgetConstants.FILTER_OUT_NEW_METRICS, "type:PERCENT" }),
  @WidgetProperty(key = "maxItems", type = WidgetPropertyType.INTEGER, defaultValue = "100"),
})
public class MeasureFilterAsCloudWidget extends CoreWidget {

  public MeasureFilterAsCloudWidget() {
    super("measure_filter_cloud", "Measure Filter as Cloud", "/org/sonar/plugins/core/widgets/measures/measure_filter_cloud.html.erb");
  }

}
