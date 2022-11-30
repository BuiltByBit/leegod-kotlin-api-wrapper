package dev.imanity.bbbapi.request.impl.resource.update

import dev.imanity.bbbapi.model.Update
import dev.imanity.bbbapi.model.sort.SortOptions
import dev.imanity.bbbapi.request.Method
import dev.imanity.bbbapi.request.Request

class ListResourceUpdatesRequest(
    resourceId: Int,
    sortOptions: SortOptions
): Request<Array<Update>>(
    "resources/$resourceId/updates${sortOptions}",
    Method.GET,
    null
)