package mobi.pooh3.navigationinbottomnavigation.home.dummy

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent2 {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<NotifyData> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, NotifyData> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
        (1..COUNT).forEach { addItem(createDummyItem(it)) }
    }

    private fun addItem(item: NotifyData) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): NotifyData {
        return NotifyData(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        (0 until position).forEach{
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class NotifyData(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}
