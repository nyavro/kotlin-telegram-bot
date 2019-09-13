package me.ivmg.telegram.entities

import com.google.gson.annotations.SerializedName as Name
import me.ivmg.telegram.entities.payments.SuccessfulPayment
import me.ivmg.telegram.entities.stickers.Sticker

data class Message(
    @Name("message_id") val messageId: Long,
    val from: User?,
    val date: Int,
    val chat: Chat,
    @Name("forward_from") val forwardFrom: User?,
    @Name("forward_from_chat") val forwardFromChat: Chat?,
    @Name("forward_from_message_id") val forwardFromMessageId: Int?,
    @Name("forward_signature") val forwardSignature: String?,
    @Name("forward_sender_name") val forwardSenderName: String?,
    @Name("forward_date") val forwardDate: Int?,
    @Name("reply_to_message") val replyToMessage: Message?,
    @Name("edit_date") val editDate: Int?,
    val text: String?,
    val entities: List<MessageEntity>?,
    @Name("caption_entities") val captionEntities: List<MessageEntity>?,
    val audio: Audio?,
    val document: Document?,
    val animation: Animation?,
    val game: Game?,
    val photo: List<PhotoSize>?,
    val sticker: Sticker?,
    val video: Video?,
    val voice: Voice?,
    @Name("video_note") val videoNote: VideoNote?,
    val caption: String?,
    val contact: Contact?,
    val location: Location?,
    val venue: Venue?,
    @Name("new_chat_member") val newChatMember: User?,
    @Name("left_chat_member") val leftChatMember: User?,
    @Name("new_chat_title") val newChatTitle: String?,
    @Name("new_chat_photo") val newChatPhoto: List<PhotoSize>?,
    @Name("delete_chat_photo") val deleteChatPhoto: Boolean?,
    @Name("group_chat_created") val groupChatCreated: Boolean?,
    @Name("supergroup_chat_created") val supergroupChatCreated: Boolean?,
    @Name("channel_chat_created") val channelChatCreated: Boolean?,
    @Name("migrate_to_chat_id") val migrateToChatId: Long?,
    @Name("migrate_from_chat_id") val migrateFromChatId: Long?,
    val invoice: Invoice?,
    @Name("successful_payment") val successfulPayment: SuccessfulPayment?,
    @Name("reply_markup") val replyMarkup: InlineKeyboardMarkup?
)
