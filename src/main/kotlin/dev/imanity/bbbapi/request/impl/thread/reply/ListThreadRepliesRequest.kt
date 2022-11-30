package dev.imanity.bbbapi.request.impl.thread.reply

import dev.imanity.bbbapi.model.Reply
import dev.imanity.bbbapi.model.sort.SortOptions
import dev.imanity.bbbapi.request.Method
import dev.imanity.bbbapi.request.Request

class ListThreadRepliesRequest(threadId: Int, sortOptions: SortOptions) : Request<Array<Reply>>(
    "threads/$threadId/replies${sortOptions}",
    Method.GET,
    null
)