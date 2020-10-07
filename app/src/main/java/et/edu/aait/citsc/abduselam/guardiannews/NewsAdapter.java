package et.edu.aait.citsc.abduselam.guardiannews;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each Item
 * in the data source (a list of {@link Item} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<Item> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<Item> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the item at the given position
     * in the list of news.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent ) {
        // check if there is an existing list item view (called convertView) that we can reuse
        // otherwise, if convertView is null, then inflate a new list item layout.

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_view, parent, false);
        }

        Item currentItem = getItem(position);

        //ImageView thumbnail = listItemView.findViewById(R.id.thumbnail);
        //thumbnail.setImageURI(currentItem.getImgUrl());

        TextView title = listItemView.findViewById(R.id.news_title);
        title.setText(currentItem.getTitle());

        TextView sectionName = listItemView.findViewById(R.id.section_name);
        sectionName.setText(currentItem.getSectionName());

        TextView pubDate = listItemView.findViewById(R.id.date);
        pubDate.setText(currentItem.getPublicationDate());

        return listItemView;
    }
}
