/**
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.neo4j.annotation.relatedto;

import org.springframework.data.neo4j.annotation.IdentifiableEntity;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class AppleStore extends IdentifiableEntity {
    @RelatedTo(type = "supplies", enforceTargetType = true)
    private MacBook macBook;

    @RelatedTo(type = "supplies", enforceTargetType = true)
    private RetinaMacBook retinaMacbook;

    @RelatedTo(type = "supplies", enforceTargetType = true)
    private Iterable<MacBook> supplies;

    public void suppliesMacBook(MacBook macbook) {
        this.macBook = macbook;
    }

    public void suppliesRetinaMacBook(RetinaMacBook retinaMacbook) {
        this.retinaMacbook = retinaMacbook;
    }

    public Iterable<MacBook> getSupplies() {
        return supplies;
    }
}
