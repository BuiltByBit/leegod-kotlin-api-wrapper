package dev.imanity.bbbapi.request.impl.resource.license

import dev.imanity.bbbapi.model.License
import dev.imanity.bbbapi.request.Method
import dev.imanity.bbbapi.request.Request

class RetrieveResourceLicenseByMemberRequest(
    resourceId: Int,
    memberId: Int,
    nonce: Int,
    timestamp: Long
) : Request<License>(
    "resources/$resourceId/licenses/members/$memberId",
    Method.GET,
    mapOf(
        "nonce" to nonce,
        "timestamp" to timestamp
    )
)