package com.xfx.ledcontroller.ui.base;

/**
 * Created by wushange on 2016/08/16.
 */
public interface BaseEvents {
    void setObj(Object obj);

    Object getObj();

    enum CommonEvent implements BaseEvents {
        UPDATE_LIST,UPDATE_ALLOTED_LIST,UPDATE_CHANGELIST;

        private Object object;

        @Override
        public void setObj(Object obj) {

            this.object = obj;
        }

        @Override
        public Object getObj() {
            return object;
        }

        @Override
        public String toString() {
            return "CommonEvent{" +
                    "object=" + object +
                    '}';
        }
    }

}
