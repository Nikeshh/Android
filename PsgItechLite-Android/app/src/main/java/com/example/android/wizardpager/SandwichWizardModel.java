/*
 * Copyright 2012 Roman Nurik
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

package com.example.android.wizardpager;

import android.content.Context;

import com.example.android.wizardpager.pages.CustomerInfoPage;
import com.tech.freak.wizardpager.model.AbstractWizardModel;
import com.tech.freak.wizardpager.model.BranchPage;
import com.tech.freak.wizardpager.model.PageList;
import com.tech.freak.wizardpager.model.SingleFixedChoicePage;
import com.tech.freak.wizardpager.model.TextPage;

public class SandwichWizardModel extends AbstractWizardModel {
    public SandwichWizardModel(Context context) {
        super(context);
    }

    @Override
    protected PageList onNewRootPageList() {
        return new PageList(new BranchPage(this, "Order type").addBranch(
                "Daily made eatables",
                new SingleFixedChoicePage(this, "Daily made eatables").setChoices("White",
                        "Wheat", "Rye", "Pretzel", "Ciabatta")
                        .setRequired(true))

                .addBranch(
                        "Eatables",
                        new SingleFixedChoicePage(this, "Eatables").setChoices(
                                "Greek", "Caesar").setRequired(true))
                .addBranch(
                        "Fresh juices",
                        new SingleFixedChoicePage(this, "Fresh juices").setChoices(
                                "Greek", "Caesar").setRequired(true))
                .addBranch(
                        "Breakfast",
                        new SingleFixedChoicePage(this, "Breakfast").setChoices(
                                "Greek", "Caesar").setRequired(true))
                .addBranch(
                        "Lunch",
                        new SingleFixedChoicePage(this, "Lunch").setChoices(
                                "Greek", "Caesar").setRequired(true))
                .addBranch(
                        "Evening snacks",
                        new SingleFixedChoicePage(this, "Evening snacks").setChoices(
                                "Greek", "Caesar").setRequired(true))
                .addBranch(
                        "Dinner",
                        new SingleFixedChoicePage(this, "Dinner").setChoices(
                                "Greek", "Caesar").setRequired(true))
                .addBranch(
                        "Special varities",
                        new SingleFixedChoicePage(this, "Special varities").setChoices(
                                "Greek", "Caesar").setRequired(true))
                .setRequired(true),
                new TextPage(this, "Comments").setRequired(true)

                        .setRequired(true),

                new CustomerInfoPage(this, "Your info").setRequired(true));
    }
}
